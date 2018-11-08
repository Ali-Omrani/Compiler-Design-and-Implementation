import java.util.*;

public class SymbolTable {

	// Static members region

	public static SymbolTable top;

	private static Stack<SymbolTable> stack = new Stack<SymbolTable>();

	private static Queue<SymbolTable> queue = new LinkedList<SymbolTable>();

	private static int definitionsCount = 0;

	public int firstOffset;

	public static int getReceiverCount() {
		return receiverCount;
	}

	public static void setReceiverCount(int receiverCount) {
		SymbolTable.receiverCount = receiverCount;
	}

	private static List<ActorReceiverPair>  actorReceiverPairs = new ArrayList<>();

	public static void addActorReceiverPair(ActorReceiverPair actorReceiverPair){
			actorReceiverPairs.add(actorReceiverPair);
	}
	private static int
receiverCount = 0;

	public static ArrayList<Actor> actors = new ArrayList<>();

	public static String resultString = "";

	public static boolean hasError = false;

	public static int getGlobalOffset() {
		return globalOffset;
	}

	public static void setGlobalOffset(int globalOffset) {
		SymbolTable.globalOffset = globalOffset;
	}

	private static int globalOffset = 0;

	public void print(){
		System.out.println("----------SYMBOL-TABLE-------------");
		for (SymbolTableItem itemValue : items.values()){
			System.out.println(itemValue.itemToString());
		}
		System.out.println("-----------------------------------");
	}

	public static void addActor(Actor actor){
		actors.add(actor);
	}


	// Use it in pass1 scope start
	public static void push(SymbolTable symbolTable) {
		if(top != null)
			stack.push(top);
		top = symbolTable;
		queue.offer(symbolTable);
	}

	// Use it in pass1, pass2 scope end
	public static void pop() {
		top = stack.pop(); }

	// Use it in pass2 scope start
	public static void push() {
		push(queue.remove());
	}

	// Use it in pass2, where an item with property "defMustBeComesBeforeUse == true" is defined
	public static void define() {

		++definitionsCount;
		//System.out.println("+++++++++++++++++++ in define ++++++++++++++++++ definitionCount = "+definitionsCount);
	}

	public static int getStackSize(){
		return stack.getSize();
	}

	// End of static members region

	public SymbolTable(){
		this(null);
	}

	public SymbolTable(SymbolTable pre){
		this.pre = pre;
		this.items = new HashMap<String, SymbolTableItem>();
		this.offsets = new HashMap<Register, Integer>();
	}



	public void changeType(String key, Type newType)
	{
		SymbolTableVariableItemBase item = (SymbolTableVariableItemBase)items.get(key);
		item.variable.setType(newType);;

	}


	public void put(SymbolTableItem item) throws ItemAlreadyExistsException {
		if(items.containsKey(item.getKey()))
			throw new ItemAlreadyExistsException();
		items.put(item.getKey(), item);
//		System.out.println("item size in put:"+items.size());

		if(item instanceof SymbolTableVariableItemBase) {
			SymbolTableVariableItemBase castedItem = (SymbolTableVariableItemBase) item;
			setOffset(
					castedItem.getBaseRegister(),
					getOffset(castedItem.getBaseRegister()) + castedItem.getSize()
			);
		}
	}

	public int getOffset(Register baseRegister) {
		if(!offsets.containsKey(baseRegister))
			return 0;
		return offsets.get(baseRegister);
	}

	public void setOffset(Register baseRegister, int value) {
		offsets.put(baseRegister, value);
	}

	public SymbolTableItem getInCurrentScope(String key) {
		return items.get(key);
	}

	public Boolean containsItemName(String name){
		return items.containsKey(name);
	}

	public SymbolTableItem get(String key) {
		SymbolTableItem value = items.get(key);

		if(value == null && pre != null)
			return pre.get(key);

//		if(value!=null){
//			System.out.println("key:--"+key+"--");
//			System.out.println(value.itemToString());
//			System.out.println(value.useMustBeComesAfterDef());
//			System.out.println(Integer.toString(SymbolTable.definitionsCount));
//			System.out.println(Integer.toString(value.getDefinitionNumber()));
//		}
		if(value!=null) {
			if (value.useMustBeComesAfterDef() &&
					SymbolTable.definitionsCount <= value.getDefinitionNumber()) {
				if (pre != null)
					return pre.get(key);
				else
					return null;
			}
		}
		return value;
	}

	public SymbolTable getPreSymbolTable() {
		return pre;
	}


	SymbolTable pre;
	HashMap<String, SymbolTableItem> items;
	HashMap<Register, Integer> offsets;

	public static int getActorIdByName(String actorName) {
		for(int i=0;i<actors.size();i++){
			if(actors.get(i).getName().equals(actorName)){
				return i;
			}
		}
		return -1;
	}


	public static int getReceiverIdBySign(String actorName, String receiverSign) {
//		System.out.println("&&&& serch for Id &&&&&&");
//		System.out.println(actorName);
//		System.out.println(receiverSign);
		for(int i=0; i<actorReceiverPairs.size();i++){
			System.out.println(i+":"+actorReceiverPairs.get(i).getActorName()+"-"+actorReceiverPairs.get(i).getReceiverSign());
			if(actorReceiverPairs.get(i).getReceiverSign().equals(receiverSign)){
				if(actorReceiverPairs.get(i).getActorName().equals(actorName)){
					return i;
				}
			}
		}
		return -1;
	}

	public static int getArgumentsCountByReceiverSign(String actorName, String receiverSign){
//		System.out.println("&&&& serch for count &&&&&&");
//		System.out.println(actorName);
//		System.out.println(receiverSign);
		for(int i=0; i<actorReceiverPairs.size();i++){
		//	System.out.println(i+":"+actorReceiverPairs.get(i).getActorName()+"-"+actorReceiverPairs.get(i).getReceiverSign());
			if(actorReceiverPairs.get(i).getReceiverSign().equals(receiverSign)){
				if(actorReceiverPairs.get(i).getActorName().equals(actorName)){
					return actorReceiverPairs.get(i).getArgumentCount();
				}
			}
		}
		return -1;
	}

	public static ActorReceiverPair getReceiverActorPairByActorAndSign(String actorName, String receiverSign) {
		for(int i=0; i<actorReceiverPairs.size();i++){
			if(actorReceiverPairs.get(i).getReceiverSign().equals(receiverSign)){
				if(actorReceiverPairs.get(i).getActorName().equals(actorName)){
					actorReceiverPairs.get(i);
				}
			}
		}
		return null;
	}

	public static int getActorBaseBufferAddress(int actorId) {
		int result=0;
		for(int i=0; i<actorId; i++){
			result+=actors.get(i).getBufferSize();
		}
		return result;
	}
	public static void setActorInit(String actorName, int receiverId){
		int actorId = getActorIdByName(actorName);
		actors.get(actorId).setHasInit(true);
		actors.get(actorId).setInitId(receiverId);
	}
}