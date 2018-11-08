import java.util.ArrayList;
import java.util.List;

public class ArrayType extends Type{


    private int length;
    private Type type;

    public ArrayType(int length, Type type) {
        this.length = length;
        this.type = type;
    }

    @Override
    public int size() {
        return length*type.size();
    }


    @Override
    public String getDefaultValue(){ return "AR";}

    //TODO: override equals method for actor type
    @Override
    public boolean equals(Object other) {
        if(other instanceof ArrayType){
            ArrayType otherArray = (ArrayType) other;

            if(this.toString().equals(otherArray.toString())){
                return true;
            }
        }
        return false;
//        if((other instanceof IntType)&&(getBaseType().toString()=="int")){
//            return true;
//        }
//        else if((other instanceof CharType)&&(getBaseType().toString()=="char")){
//            return true;
//        }
//        else {
//            return false;
//        }
    }
    @Override
    public String toString() {
        return "array("+length+","+type.toString()+")";
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getInnerType(int layernum){
        if(layernum==1){
            return type;
        }
        else{
            layernum--;
            ArrayType arrayType = (ArrayType)type;
            return(arrayType.getInnerType(layernum));
        }
    }
    public List<Integer> getDimensionsForStack(){
        int dims = this.getDimension();
        ArrayType arrayType = this;
        List<Integer> dimensions = new ArrayList<>();
        for(int i=0; i<dims-1; i++){
            dimensions.add(arrayType.length);
            arrayType = (ArrayType) arrayType.type;
        }
        dimensions.add(arrayType.length);
        System.out.println("ssizzzeeee:"+dimensions.size());
        return dimensions;
    }

    public int getDimension(){
        if(type instanceof IntType||type instanceof CharType){
            return 1;
        }
        else{
            ArrayType arrayType = (ArrayType)type;
            return (1 +arrayType.getDimension());
        }
    }

    public Type getBaseType(){
        if(type instanceof IntType||type instanceof CharType){
//            System.out.println("in getBaseType : int or char");
//            System.out.println(type.toString());
            return type;
        }
        else{
//            System.out.println("in getBaseType : array");
            ArrayType arrayType = (ArrayType)type;
//            System.out.println(type.toString());
            return arrayType.getBaseType();

        }
    }

    public int getElementCount(){
        if(type instanceof IntType || type instanceof CharType){
            return length;
        }
        else{
            ArrayType arrayType = (ArrayType)type;
            return length*arrayType.getElementCount();
        }
    }
}
