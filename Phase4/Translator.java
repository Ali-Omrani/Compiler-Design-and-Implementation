import java.util.*;
import java.io.*;

public class Translator {

    private int ifCount;
    private int messageCount = 0;
    private File output;
    private ArrayList <String> instructions;
    private ArrayList <String> initInstructions;
    private static Stack<Integer> instructoinIndexStack = new Stack<Integer>();
    private ArrayList <Integer> currentExitCodeIndexes;
    private ArrayList <Integer> breakIndexes;
    private  Stack<ArrayList<Integer>> exitListStack;
    private ArrayList<String> actorBufferInstructions;
    private ArrayList<String> initMessageInstructions;
    private ArrayList<String> mainInstructions;
    private ArrayList<String> actorInstructions;
    private ArrayList<String> errorInstrunctions;
//    private ArrayList<String> actorBufferErrorInstrunction;
    private static Stack<Integer> lastOffset = new Stack<Integer>();
    private int messageSize = 4;

    public Translator() {
        actorBufferInstructions = new ArrayList<String>();
        instructions = new ArrayList<String>();
        initInstructions = new ArrayList<String>();
        currentExitCodeIndexes = new ArrayList<Integer>();
        breakIndexes = new ArrayList <Integer>();
        exitListStack = new Stack<ArrayList<Integer>>();
        ifCount = 0;
        mainInstructions = new ArrayList<String>();
        actorInstructions  = new ArrayList<String>();
        initMessageInstructions = new ArrayList<String>();
        errorInstrunctions = new ArrayList<String>();
//        actorBufferErrorInstrunction = new ArrayList<String>();
        output = new File("out.asm");
        try {
            output.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void makeOutput() {
        this.addSystemCall(10);
        try {
            PrintWriter writer = new PrintWriter(output);
            writer.println("main:");
            writer.println("move $t4, $gp");
            writer.println("move $t2, $sp");
            writer.println("li $t5, 0");

            for (int i = 0; i < actorBufferInstructions.size(); i++) {
                writer.println(actorBufferInstructions.get(i));
            }

            //---------------for stack-------------------
            writer.println("move $t3, $sp");
            writer.println("addiu $sp, $sp," + -800);
            //-------------------------------------------
            writer.println("move $fp, $sp");
            for (int i = 0; i < initInstructions.size(); i++) {
                writer.println(initInstructions.get(i));
            }

            for (int i = 0; i< initMessageInstructions.size();i++){
                writer.println(initMessageInstructions.get(i));
            }

            for (int i = 0; i < mainInstructions.size(); i++){
                writer.println(mainInstructions.get(i));
            }

            for(int i = 0; i< actorInstructions.size(); i++){
                writer.println(actorInstructions.get(i));
            }

            for (int i = 0; i < instructions.size(); i++) {
                writer.println(instructions.get(i));
            }

            for (int i = 0; i < errorInstrunctions.size(); i++) {
                writer.println(errorInstrunctions.get(i));
            }

//            for (int i = 0; i < indexErrorInstrunction.size(); i++) {
//                writer.println(indexErrorInstrunction.get(i));
//            }
            writer.println("progend:");
            writer.println("li $v0, " + 10);
            writer.println("syscall");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void generateMainInstructions(){
        mainInstructions.add("mainloop:");
        mainInstructions.add("li $t7,"+1);
//        beginScope(0);
        for(int i=0;i<SymbolTable.actors.size();i++){
            mainInstructions.add("j a"+i);
            mainInstructions.add("enda"+i+":");
        }
//        mainInstructions.add("li $t0, "+lastOffset.pop());
//        mainInstructions.add("move $sp, $t0");
//        mainInstructions.add("#ending scope");
        mainInstructions.add("li $t6,"+1);
        mainInstructions.add("beq $t7, $t6, progend");
        mainInstructions.add("j mainloop");
    }

    public void generateErrorInstructions(){
        writeError("IndexOutOfBoundError");
//        writeError("ActorBufferError");
    }


    public void allocateActorBuffer(int buffersSize){
        actorBufferInstructions.add("#allocating buffer for actor");
        actorBufferInstructions.add("addiu $sp, $sp," + (-4 * messageSize) * buffersSize);
        actorBufferInstructions.add("#end of allocating buffer for actor");
    }

    public void putInitMessages(){
        for(int i = 0; i<SymbolTable.actors.size();i++){
            Actor actor = SymbolTable.actors.get(i);
            if(actor.isHasInit()){
                initMessageInstructions.add("#adding init message for actor"+i);
                int actorBaseBufferAddress = SymbolTable.getActorBaseBufferAddress(i);
                initMessageInstructions.add("li $a0, " + (actorBaseBufferAddress * 4 * messageSize));
                initMessageInstructions.add("li $a2, -1");
                initMessageInstructions.add("mul $a0, $a0, $a2");
                initMessageInstructions.add("add $a0, $a0, $t2"); // base buffer address is in a0 now
                initMessageInstructions.add("li $a1,"+i);
                initMessageInstructions.add("sw $a1, 0($a0)");
                initMessageInstructions.add("li $a1,"+actor.getInitId());
                initMessageInstructions.add("sw $a1, -4($a0)");
                initMessageInstructions.add("move $a1, $t5" );
                initMessageInstructions.add("add $a1, $a1, $gp");
                initMessageInstructions.add("sw $a1, -8($sp)");
                initMessageInstructions.add("sw $a1, -12($sp)");
                initMessageInstructions.add("lw $a1, " + (i * 4) + "($t4)"); // number of unread messages in a1
                initMessageInstructions.add("addi $a1, $a1, 1");
                initMessageInstructions.add("sw $a1, " + (i * 4) + "($t4)"); // number of unread messages in a1
                initMessageInstructions.add("#end of adding init message for actor"+i);
            }
        }
    }

    public void allocateUnreadMessageSpaceForActorBuffer(String actorName) {
        int actorId = SymbolTable.getActorIdByName(actorName);
        Actor actor = SymbolTable.actors.get(actorId);
        int defaultUnreadNum = (actor.isHasInit()?1:0);
        actorBufferInstructions.add("#allocating space for actor unread count");
        actorBufferInstructions.add("li $a0,"+defaultUnreadNum);
        actorBufferInstructions.add("sw $a0, 0($gp)");
        actorBufferInstructions.add("addiu $gp, $gp, 4");
        actorBufferInstructions.add("#end of allocating space for actor unread count");
    }

    public void getNewExitListAndPush(){
        instructions.add("#exitliststack size before = "+ exitListStack.getSize());
        exitListStack.push(currentExitCodeIndexes);
        instructions.add("#exitliststack size after = "+ exitListStack.getSize());
        currentExitCodeIndexes = new ArrayList<Integer>();
    }


    public void addJumpExit(){
        int index = instructions.size();
        instructions.add("dummy instruction for exit code");
        currentExitCodeIndexes.add(index);
    }

    public void compJumpExitAndPop(String label){
        for (int i=0; i<currentExitCodeIndexes.size(); i++)
        {
            int index = currentExitCodeIndexes.get(i);
            instructions.set(index, "j "+label);
        }
        //mem leak?
        instructions.add("#exitliststack size before = "+ exitListStack.getSize());
        currentExitCodeIndexes = exitListStack.pop();
        instructions.add("#exitliststack size after = "+ exitListStack.getSize());
    }



    public void jz(){
        instructions.add("#start of jz");
        instructions.add("lw $a0, 4($sp)");
        popStack();
        pushAndIncPC();
        instructions.add("#end of jz");
    }

    public void elseIfjcompjpz(String label){
        instructions.add("#start of jcompjpz");
        addLabel(label);
        int jzIndex = instructoinIndexStack.pop();
        instructions.add("#Checking previous BE");
        instructions.add("lw $a0, 4($sp)");
        popStack();
        //completing previous if jump
        instructions.set(jzIndex, "beqz $a0, "+ label);
        //pushing PC for current jump
        pushAndIncPC();


        instructions.add("#end of jcompjpz");
    }

    public void jcompjpz(String label){
        instructions.add("#start of jcompjpz");
        //pushAndIncPC();
        int index = instructions.size();
        instructions.add("#dummy instruction for j, pushing "+ index);
        //we have to jump to pc+1
        addLabel(label);
        int jzIndex = instructoinIndexStack.pop();
//        instructions.add("lw $a0, 0($sp)");
//        popStack();
        instructoinIndexStack.push(index);
        instructions.set(jzIndex, "beqz $a0, "+ label);
        instructions.add("#end of jcompjpz");
    }

    public void compjpz(String label){
        instructions.add("#start of compjpz");
        addLabel(label);
        int jpzIndex = instructoinIndexStack.pop();
//        instructions.add("lw $a0, 0($sp)");
//        popStack();
        instructions.set(jpzIndex, "beqz $a0," + label);
        instructions.add("#end of compjpz");
    }

    public void compjp(String label){
        instructions.add("#start of compjp");
        addLabel(label);
        int jIndex = instructoinIndexStack.pop();
        instructions.set(jIndex, "j "+label);
        instructions.add("#end of compjp");
    }


    public void addLabel(String label) {
        instructions.add("#start adding label");
        instructions.add(label+ ":");
        instructions.add("#end adding label");
    }

    public void pushAndIncPC(){
        int index = instructions.size();
        instructions.add("#dummy instruction for beqz, pushing "+ index);
        instructoinIndexStack.push(index);
    }



//    public void ifStatement(){
//        instructions.add("#adding label for if -- ifCount = " + ifCount);
//        ifCount++;
//        instructions.add("if" + ifCount + ":");
//        instructions.add("lw $t0, 0($sp)");
//        instructions.add("beqz $t0, ");
//        instructions.add("#end of adding label for if");
//
//    }

//    public void pushPC(){
//        instructions.add("# start of pushPC");
//        instructions.add("jal $0");
//        instructions.add("sw $ra, 0($sp)");
//        instructions.add("addiu $sp, $sp, -4");
//        instructions.add("# end of pushPC");
//    }
//
//    public void incPC(){
//        instructions.add("# start of incPC dummy instruction");
////        instructions.add("addiu $pc, $pc, -4");
//        instructions.add("move $a0, $a0");
//        instructions.add("# end of incPC");
//    }

    public void addToStack(String x){
        instructions.add("# adding a number to stack");
        instructions.add("li $a0, " + x);
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of adding a number to stack");

    }

    public void getTempSpaceInStack(int size) {
        instructions.add("# getting temp space in stack");
        instructions.add("addiu $sp, $sp, -" + size);
        instructions.add("# end of getting temp space in stack");
    }

    public void beginScope(int lastLocalOffset) {
        instructions.add("#begining scope"+lastLocalOffset);
        lastOffset.push(lastLocalOffset);
    }

//    public void beginReceiverScope(int argumentNum) {
//         instructions.add("li $a0,"+(argumentNum*4));
//         instructions.add("add $a0, $a0, $sp");
//         instructions.add("move $t0, $a0");
//    }

    public void endScope() {
        instructions.add("li $t0, "+(-lastOffset.pop()));
        instructions.add("add $t0, $fp, $t0");
        instructions.add("move $sp, $t0");
        instructions.add("#ending scope");
    }

    public void leftArrayAccess(int indexCount, List<Integer> dimensions) {
        instructions.add("#start of left array access");
        instructions.add("lw $a1," + (4 * (indexCount + 1)) + "($sp)");
        this.findArrayAccessAddr(indexCount, dimensions, false);
        instructions.add("# end of left array access");
    }

    public void findArrayAccessAddr(int indexCount, List<Integer> dimensions, boolean isRight) {
        instructions.add("#start of finding array access addr"); // base is in a1
        instructions.add("li $a2, 0");
        for (int i = 1; i <= indexCount; i++) {
            instructions.add("lw $a0, 4($sp)");
            for (int j = 0; j < (dimensions.size() - (indexCount - (i - 1))); j++) {
                instructions.add("li $t1," + dimensions.get(dimensions.size() - (j + 1)));
                instructions.add("mul $a0, $a0, $t1");
            }
            instructions.add("add $a2, $a2, $a0");
            popStack();
        }
        if (!isRight) {
            popStack();
        }
        instructions.add("li $t1, 4");
        instructions.add("mul $a2, $a2, $t1");
        instructions.add("sub $a2, $a1, $a2");
        instructions.add("sw $a2, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of finding array access address");
    }

    public void rightArrayAccess(int indexCount, List<Integer> dimensions, int accessCount, int offset) {
        instructions.add("#start of right array access");
        instructions.add("li $a1," + offset * (-1));
        instructions.add("add $a1, $a1, $fp");
        this.findArrayAccessAddr(indexCount, dimensions, true);
        popStack();
        for (int i = 0; i < accessCount; i++) {
            instructions.add("# start of adding variable to stack in right array access");
            instructions.add("lw $a0, " + (-4 * i) + "($a2)");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
            instructions.add("# end of adding variable to stack");
        }
        instructions.add("# end of right array access");
    }


    //TODO: nemdoonam!
    public void addToStack(String s, int adr) {
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding variable to stack");
        instructions.add("lw $a0, " + adr + "($fp)");
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of adding variable to stack");
    }

    //address=>same size for every type
    public void addAddressToStack(String s, int adr) {
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding address to stack");
        instructions.add("addiu $a0, $fp, " + adr);
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of adding address to stack");
    }

    //address=>same size for every type
    public void addGlobalAddressToStack(String s, int adr) {
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding global address to stack");
        instructions.add("addiu $a0, $gp, " + adr);
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of adding global address to stack");
    }

    public void loadIndirect(int elementCount) {
        instructions.add("# start of loadIndirect");
        instructions.add("lw $a1, 4($sp)");
        popStack();
        //instructions.add("addu $a1, $fp, $a0");
        for (int i = 0; i < elementCount; i++) {
            instructions.add("lw $a2, " + (4 * i) + "($a1)");
            instructions.add("sw $a2, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        instructions.add("# end of loadIndirect");
    }

    public void popStack() {
        instructions.add("# pop stack");
        instructions.add("addiu $sp, $sp, 4");
        instructions.add("# end of pop stack");
    }

    public void addSystemCall(int x) {
        instructions.add("# start syscall " + x);
        instructions.add("li $v0, " + x);
        instructions.add("syscall");
        instructions.add("# end syscall");
    }

    public void addSystemCallError(int x) {
        errorInstrunctions.add("# start syscall " + x);
        errorInstrunctions.add("li $v0, " + x);
        errorInstrunctions.add("syscall");
        errorInstrunctions.add("# end syscall");
    }

    public void arrayAssignCommand(int elementCount) {
        instructions.add("#start of assign array");
        instructions.add("lw $a1, " + ((elementCount + 1) * 4) + "($sp)");
        for (int i = 1; i <= elementCount; i++) {
            instructions.add("lw $a0, " + (4 * i) + "($sp)");
            instructions.add("sw $a0, " + (-4 * (elementCount - i)) + "($a1)");
        }
        for (int i = elementCount; i > 0; i--) {
            instructions.add("lw $a2, " + (4 * i) + "($sp)");
            instructions.add("sw $a2, " + (4 * (i + 1)) + "($sp)");
        }
        popStack();
        instructions.add("#end of assign array");
    }

    public void assignCommand(){
        instructions.add("# start of assign");
        instructions.add("lw $a0, 4($sp)");
        popStack();
        instructions.add("lw $a1, 4($sp)");
        popStack();
        instructions.add("sw $a0, 0($a1)");
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        //popStack();
        instructions.add("# end of assign");
    }

    public void arrayOperationCommand(String s, int arraySize){
//        int leftAddrOffset = (arraySize+1)*4;
        if (s.equals("==")) {
            addCommentToInstructions("+++++++++++++++ start array equality +++++++++++++");
            instructions.add("li $a2, 1");
            for (int i=arraySize; i>0; i-- ){
                //a0 = current elemt of RHS
                instructions.add("lw $a0, "+ i*4+"($sp)");
//                //a1 = offset of current element of LHS
//                instructions.add("lw $a1, "+leftAddrOffset+"($sp)");
//                // a1 = addr of current element of LHS
//                instructions.add("subu $a1, $fp, $a1");
                //a1 = current element of LHS
                instructions.add("lw $a1, "+(arraySize+i)*4+"($sp)");
                //a0 = (a0 == a1)
                instructions.add("seq $a0, $a1, $a0");
                //a2 = a2&a0
                instructions.add("and $a2, $a2, $a0");
            }
            //pop RHS
            for (int i=arraySize; i>0; i-- ){
                popStack();
            }
            //pop LHS addr
            popStack();
            //push a2 on stack
            instructions.add("sw $a2, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
            addCommentToInstructions("+++++++++++++++ end array equality +++++++++++++");
        }

        else if (s.equals("<>")) {
            addCommentToInstructions("+++++++++++++++ start array equality +++++++++++++");
            instructions.add("li $a2, 0");
            for (int i=arraySize; i>0; i-- ){
                instructions.add("lw $a0, "+ i*4+"($sp)");
                //a1 = current element of LHS
                instructions.add("lw $a1, "+(arraySize+i)*4+"($sp)");
                //a0 = (a0 == a1)
                instructions.add("sne $a0, $a1, $a0");
                //a2 = a2&a0
                instructions.add("or $a2, $a2, $a0");
            }
            //pop RHS
            for (int i=arraySize; i>0; i-- ){
                popStack();
            }
            //pop LHS addr
            popStack();
            //push a2 on stack
            instructions.add("sw $a2, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
            addCommentToInstructions("+++++++++++++++ end array equality +++++++++++++");
        }

    }

    public void operationCommand(String s){
        instructions.add("# operation " + s);
        if (s.equals("*")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("mul $a0, $a0, $a1");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("/")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("div $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        } else if (s.equals("+")) {
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("add $a0, $a0, $a1");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        } else if (s.equals("-")) {
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("sub $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        } else if (s.equals("and")) {
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("and $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        } else if (s.equals("or")) {
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("or $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        } else if (s.equals("==")) {
            System.out.println("+++++++++++++++ in equality +++++++++++++");
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("seq $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        } else if (s.equals("<>")) {
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("sne $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        } else if (s.equals("not")) {
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("li $a1, 0");
            instructions.add("seq $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        } else if (s.equals("-")) {
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("li $a1, 0");
            instructions.add("sub $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        } else if (s.equals("<")) {
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("slt $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if(s.equals(">")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("slt $a0, $a0, $a1");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }

        instructions.add("# end of operation " + s);
    }

    //char
    public void write(int elementCount) {
        instructions.add("# writing String/Char");
        //TODO: lw/lb
        for (int i = elementCount; i > 0; i--) {
            instructions.add("lw $a0, " + i * 4 + "($sp)");
            this.addSystemCall(11);
        }

        for (int i = elementCount; i > 0; i--)
            popStack();


        instructions.add("addi $a0, $zero, 10");
        this.addSystemCall(11);
        instructions.add("# end of writing String/Char");
    }

    public void writeIndirect(int elementCount) {
        instructions.add("# writing Indirect String/Char");
        //TODO: lw/lb
        instructions.add("lw $a1, 4($sp)");
        for (int i = 0; i < elementCount; i++) {
            instructions.add("lw $a0, " + i * 4 + "($a1)");
            this.addSystemCall(11);
        }
        instructions.add("addi $a0, $zero, 10");
        this.addSystemCall(11);
        instructions.add("# end of writing Indirect String/Char");
    }


    public void writeIndirect() {
        instructions.add("# writing Indirect int");
        instructions.add("lw $a1, 4($sp)");
        instructions.add("lw $a0, 0($a1)");
        this.addSystemCall(1);
        popStack();
        instructions.add("addi $a0, $zero, 10");
        this.addSystemCall(11);
        instructions.add("# end of writing Indirect int");
    }

    public void write() {
        instructions.add("# writing int");
        instructions.add("lw $a0, 4($sp)");
        this.addSystemCall(1);
        popStack();
        instructions.add("addi $a0, $zero, 10");
        this.addSystemCall(11);
        instructions.add("# end of writing int");
    }

    public void addGlobalToStack(int adr) {
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding global variable to stack");
        instructions.add("lw $a0, " + adr + "($gp)");
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end of adding global variable to stack");
    }

    public void addGlobalVariable(int adr, String x) {
//        int adr = table.getAddress(s)*(-1);
        initInstructions.add("# adding a global variable");
        initInstructions.add("li $a0, " + x);
        initInstructions.add("sw $a0, " + adr + "($gp)");
        initInstructions.add("addi $t5, $t5, 4");
        initInstructions.add("# end of adding a global variable");
    }


    public void addCommentToInstructions(String comment) {
        instructions.add("# " + comment);
    }

    public void addCommentToInitInstructions(String comment) {
        initInstructions.add("# " + comment);
    }

    //    public void read(int length){
//        instructions.add("# start reading");
//        instructions.add("move $a0, $sp");
//        getTempSpaceInStack(length);
//        instructions.add("li $a1,"+ length);
//        this.addSystemCall(8);
//        instructions.add("# end of reading");
//    }
    public void read(int length) {
        instructions.add("# start reading");
        for (int i = 0; i < length; i++) {
            this.addSystemCall(12);
            instructions.add("sw $v0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        instructions.add("# end of reading");
    }


    public void sendMessage(String actorName, String receiverSign, int lineNum) {
        messageCount++;
        instructions.add("#start sending message");
        int actorId = SymbolTable.getActorIdByName(actorName);
        int actorBufferSize = SymbolTable.actors.get(actorId).getBufferSize();
        System.out.println("actorId for name :" + actorName + " : " + actorId);
        int receiverId = SymbolTable.getReceiverIdBySign(actorName, "receiver: " + receiverSign);
        System.out.println("receiverId for name :" + receiverSign + " : " + receiverId);
        int argumentsCount = SymbolTable.getArgumentsCountByReceiverSign(actorName, "receiver: " + receiverSign);
        System.out.println("argument count : "+argumentsCount);
        int actorBaseBufferAddress = SymbolTable.getActorBaseBufferAddress(actorId);
        instructions.add("lw $a1, " + (actorId * 4) + "($t4)"); // number of unread messages in a1
        instructions.add("li $a3, " + actorBufferSize);
        instructions.add("beq $a1, $a3, ActorBufferError"+lineNum);
        instructions.add("mul $a1, $a1, 16"); // finding offset in actor's buffer
        instructions.add("addi $a1, $a1," + (actorBaseBufferAddress * 4 * messageSize)); // adding base address for actor
        instructions.add("li $a2, -1"); // mult -1
        instructions.add("mul $a1, $a1, $a2");
        instructions.add("li $a0," + actorId);
        instructions.add("add $a2, $a1, $t2"); // oomad balaye t2
        instructions.add("sw $a0, 0($a2)");
        instructions.add("li $a0," + receiverId);
        instructions.add("sub $a2, $a2, 4");
        instructions.add("sw $a0, 0($a2)"); // put receiver id in message
        instructions.add("move $a0, $t5" );
        instructions.add("add $a0, $a0, $gp");
        instructions.add("sub $a2, $a2, 4");
        instructions.add("sw $a0, 0($a2)"); // address e shoorooe argument in heap
        System.out.println("arg count :" + argumentsCount);
        for (int i = 0; i < argumentsCount; i++) {
            instructions.add("lw $a0, 4($sp)");
            instructions.add("add $a1, $t5, $gp");
            instructions.add("sw $a0, 0($a1)");
            instructions.add("addi $t5, $t5, 4");
            popStack();
        }
        instructions.add("add $a0, $t5, $gp");
        instructions.add("sub $a2, $a2, 4");
        instructions.add("sw $a0, 0($a2)");
        instructions.add("lw $a1, " + (actorId * 4) + "($t4)"); // number of unread messages in a1
        instructions.add("addi $a1, $a1, 1");
        instructions.add("sw $a1, " + (actorId * 4) + "($t4)"); // number of unread messages in a1
        instructions.add("j, endsendmessage"+lineNum);
        instructions.add("ActorBufferError"+lineNum+":");
        String errormsg = "ActorBufferOverflowError";
        for (int i = 0; i < errormsg.length(); i++){
            char c = errormsg.charAt(i);
            instructions.add("li $a0,'" + c + "'");
            this.addSystemCall(11);
        }
        instructions.add("addi $a0, $zero, 10");
        this.addSystemCall(11);
        instructions.add("#end of sending message");
        instructions.add("endsendmessage"+lineNum+":");

    }

//    public void pushArguments(int actorId){
//        // addr of first arg in a1
//        // addr of last arg in a2
//        actorInstructions.add("lw $a1, 0($a1)");
//        actorInstructions.add("lw $a2, 0($a2)");
//        actorInstructions.add("argcondition"+actorId+":");
//        actorInstructions.add("beq $a1, $a2, argend"+actorId);
////        actorInstructions.add("add $a3, $a1, $gp");
////        actorInstructions.add("sw $a3, 0($sp)");
//        actorInstructions.add("lw $a3, 0($a1)");
//        actorInstructions.add("sw $a3, 0($sp)");
//        actorInstructions.add("addi $sp, $sp, -4");
//        actorInstructions.add("addi $a1, $a1, 4");
//        actorInstructions.add("j argcondition"+actorId);
//        actorInstructions.add("argend"+actorId+":");
//    }

    public void pushArguments(int actorId){
        actorInstructions.add("lw $a1, 0($a1)");
        actorInstructions.add("lw $a2, 0($a2)");
        actorInstructions.add("argcondition"+actorId+":");
        actorInstructions.add("beq $a1, $a2, argend"+actorId);
        actorInstructions.add("addi $a2, $a2, -4");
        actorInstructions.add("lw $a3, 0($a2)");
        actorInstructions.add("sw $a3, 0($sp)");
        actorInstructions.add("addi $sp, $sp, -4");
        actorInstructions.add("j argcondition"+actorId);
        actorInstructions.add("argend"+actorId+":");
    }

    public void pushDownBuffer(int actorBufferSize){
        // base buffer address in $a1
        for(int i = 0;i<actorBufferSize-1;i++){
            for(int j=0; j<messageSize; j++){
                actorInstructions.add("lw $a2,"+(-((messageSize*(i+1))*4)+(j*4))+"($a1)");
                actorInstructions.add("sw $a2,"+(-((messageSize*(i))*4)+(j*4))+"($a1)");
            }
        }
    }

    public void jumpToReceiverBegining(){
        //receiver Id in a0
        for(int i=0; i<SymbolTable.getReceiverCount(); i++){
            actorInstructions.add("li $a1,"+i);
            actorInstructions.add("beq $a0, $a1, r"+i);
        }
    }

    //TODO : check *4
    public  void generateActorCodes(){
        for(int i = 0; i<SymbolTable.actors.size(); i++){
            Actor a = SymbolTable.actors.get(i);
            actorInstructions.add("a"+i+":");
            actorInstructions.add("lw $a0, " + (i * 4) + "($t4)"); //num of unread messages
            actorInstructions.add("beqz $a0 enda"+i);
            actorInstructions.add("li $t7, 0");
            actorInstructions.add("addi $a0, -1");
            actorInstructions.add("sw $a0, " + (i * 4) + "($t4)"); //num of unread messages
            int actorBaseBufferAddress = SymbolTable.getActorBaseBufferAddress(i);
            actorInstructions.add("li $a0, " + (actorBaseBufferAddress * 4 * messageSize));
            actorInstructions.add("li $a2, -1");
            actorInstructions.add("mul $a0, $a0, $a2");
            actorInstructions.add("add $a0, $a0, $t2"); // base buffer address is in a0 now
            actorInstructions.add("addi $a0, $a0, -4"); // address of receiverId in a0
            actorInstructions.add("move $a1, $a0");
            actorInstructions.add("addi $a1, $a1, -4"); // address of first argument in a1
            actorInstructions.add("move $a2, $a1");
            actorInstructions.add("addi $a2, $a2, -4"); // address of last argument in a2
            pushArguments(i);
            actorInstructions.add("add $a1, $a0, 4");
            actorInstructions.add("lw $a0, 0($a0)");
            pushDownBuffer(a.getBufferSize());
            jumpToReceiverBegining();
        }
    }

    public void jumpToActorEnd(String actorName){
        int actorId = SymbolTable.getActorIdByName(actorName);
//        endScope();
        instructions.add("j enda"+actorId);

    }


    public void reverseArray(int arraySize){
        instructions.add("lw $t7, 4($sp)");
        popStack();
        for (int i=0;i<(arraySize/2);i++){
            instructions.add("lw $a0, "+(i+1)*4+"($sp)");
            instructions.add("lw $a1, "+(arraySize-(i))*4+"($sp)");
            instructions.add("sw $a0, "+(arraySize-(i))*4+"($sp)");
            instructions.add("sw $a1, "+(i+1)*4+"($sp)");
        }
        instructions.add("sw, $t7, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
    }


    public void copyFromStack(String register, int elementCount){
        instructions.add("#----------------copy to for stack------------");
        for (int i=elementCount; i>0; i--){
            instructions.add("lw $a0, "+i*4+"($sp)");
            instructions.add("sw $a0, 0($"+register+")");
            instructions.add("addiu $"+register+", $"+register+", -4");
        }
        for (int i=elementCount; i>0; i--){
            popStack();
        }
        instructions.add("#----------------end copy to for stack------------");
    }

    public void forJz() {
        instructions.add("#start of forJz");
        instructions.add("lw $a0, 4($t3)");
        pushAndIncPC();
        instructions.add("#end of forJz");
    }
    public void initFor(int offset, int arraySize) {
        instructions.add("#--------init for--------");
        copyFromStack("t3", arraySize/4+2);
        //a0 = addr of element
        instructions.add("addiu $a0, $fp," + offset);
        //a1 = first element of array
        arraySize = arraySize + 8;
        instructions.add("#arraySize = "+ arraySize);
        instructions.add("lw $a1, " +arraySize+" ($t3)");
        instructions.add("sw $a1, 0($a0)");
        instructions.add("#--------end init for--------");

    }

    public void jump(String label){
        instructions.add("#start of jump");
        instructions.add("j, "+label);
        instructions.add("#end of jump");
    }

    //todo working on foreach step
    //stack is from top to buttom size, addr of element, array
    public void foreachStep(int elementOffset){
        instructions.add("#----------foreachStep-----------");
        //a0 = size
        instructions.add("lw $a0, 4($t3)");
        //skip addr of element
        instructions.add("addiu $a0, $a0, 4");
        //a0 = addr of current elemnt of array
        instructions.add("addu $a0, $t3, $a0");
        //a0 = last element of array
        instructions.add("lw $a0, 0($a0)");
        //a1 = addr of element
        instructions.add("addiu $a1, $fp," + elementOffset);
        // element = last element of array (a0)
        instructions.add("sw $a0, 0($a1)");
        //a0 = size
        instructions.add("lw $a0, 4($t3)");
        //a0 = size - 4
        instructions.add("addiu $a0, $a0, -4");
        //update size
        instructions.add("sw $a0, 4($t3)");
//        instructions.add("lw $a0, "+elementOffset + "($fp)");
//        //$a0 =array second current element
//        instructions.add("lw $a0, 16($sp)");
//        //$a1 = addr of element
//        instructions.add("lw $a1, 8($sp)");
//        //element = last array
//        instructions.add("sw $a0, 0($a1)");
//        //shift addr of element down
//        instructions.add("sw $a1, 12($sp)");
//        //load array size
//        instructions.add("lw $a0, 4($sp)");
//        //decrease arraySize
//        instructions.add("addiu $a0, $a0, -4");
//        //shift array size
//        instructions.add("sw $a0, 8($sp)");
//        //pop prev arraySize
//        popStack();
//        //
//        instructions.add("#----------end of foreachStep-----------");
    }

    public void compForJump(String label){
        addLabel(label);
        int forJzIndex = instructoinIndexStack.pop();
        instructions.set(forJzIndex, "beqz $a0, "+ label);
        for(int i=0; i<breakIndexes.size(); i++){
            int index = breakIndexes.get(i);
            instructions.set(index, "j " + label);
        }
        breakIndexes.clear();
    }

    public void breakFor(){
        int index = instructions.size();
        instructions.add("#dummy instruction for break jump, pushing "+ index);
        breakIndexes.add(index);
    }

    public void popForStack(){
        instructions.add("#------------popping for stack----------");
        instructions.add("addiu $t3, $t3, 4");
        instructions.add("#------------end popping for stack----------");
    }

    public void checkIndex(int bound){
        instructions.add("#------------start checking index bound---------------");
        // a0 = current index access
        instructions.add("lw $a0, 4($sp)");
        // a1 = current index bound
        instructions.add("li $a1, "+ bound);
        // a0 should be less than a1 otherwise we have to jump to error code
        instructions.add("slt $a0, $a0, $a1");
        // jump to error and end of code if a0 >= a1
        instructions.add("beqz $a0, IndexOutOfBoundError");
        // for test
//        instructions.add("beqz $a0, alaki" + bound);
//        writeError("IndexOutOfBoundError");
//        addLabel("alaki"+ bound);
        // end for test
        instructions.add("#--------------end checking index bound---------------");
    }

    public void writeError(String ErrorMsg){
        errorInstrunctions.add(ErrorMsg+":");
        errorInstrunctions.add("#-----------------start writing error message----------");
        for (int i = 0; i < ErrorMsg.length(); i++){
            char c = ErrorMsg.charAt(i);
            errorInstrunctions.add("li $a0,'" + c + "'");
            this.addSystemCallError(11);
        }
        errorInstrunctions.add("addi $a0, $zero, 10");
        this.addSystemCallError(11);
        errorInstrunctions.add("j, progend");
        errorInstrunctions.add("#-----------------end writing error message----------");
    }

}
