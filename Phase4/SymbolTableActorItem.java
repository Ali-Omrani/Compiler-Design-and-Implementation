import java.util.ArrayList;
import java.util.List;

public class SymbolTableActorItem extends SymbolTableItem{

    public SymbolTableActorItem(String name, int bufferSize, List<String> receivers){
        this.name = name;
        this.bufferSize = bufferSize;
        this.receiverSigns = receivers;
    }

    @Override
    public String getKey() {
        return name;
    }

    @Override
    public String itemToString() {
        return name +"<"+Integer.toString(bufferSize)+">";
    }

    public void addReceivers(List<String> signs){
        receiverSigns = signs;
    }

    public void printReceivers(){
        System.out.println("==========");
        for(int i=0; i<receiverSigns.size();i++){
            System.out.println("--"+receiverSigns.get(i)+"--");
        }
        System.out.println("==========");
    }

    public boolean hasReceiver(String name){
        if(receiverSigns.contains("receiver: "+name))
            return true;
        return false;
    }

    private String name;
    private int bufferSize;
    private List<String> receiverSigns = new ArrayList<>();
}
