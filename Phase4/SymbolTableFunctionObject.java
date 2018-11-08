import java.util.HashMap;
import java.util.List;


//TODO: ask if this class needs offset field
public class SymbolTableFunctionObject extends SymbolTableItem{

    public SymbolTableFunctionObject(List<Type> arguments, String name) {
        this.arguments = arguments;
        this.name = name;
        SymbolTable.setReceiverCount(SymbolTable.getReceiverCount()+1);
        this.receiverId = SymbolTable.getReceiverCount();
    }

    @Override
    public String getKey(){
        return itemToString();
    }

    @Override
    public String itemToString(){
        String receiverToString =  "receiver: "+name+"(";
        for (Type t:arguments
             ) {
            receiverToString += t.toString()+" ";
        }
        receiverToString+=")";
        return receiverToString;

    }

    private List<Type> arguments;

    private String name;

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    private int receiverId;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Type> getArguments(){
        return arguments;
    }

    public void setArguments(List<Type> arguments){
        this.arguments = arguments;
    }

}
