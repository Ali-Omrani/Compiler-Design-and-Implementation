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

    //TODO: override equals method for actor type
    @Override
    public boolean equals(Object other) {
        return false;
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
}
