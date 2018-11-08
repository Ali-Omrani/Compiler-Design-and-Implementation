public class NoType extends Type{
    @Override
    public int size() {
        return 4;
    }

    @Override
    public String getDefaultValue(){return "NO";};
    @Override
    public boolean equals(Object other) {
        if(other instanceof NoType)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "NoType";
    }

    private static NoType instance;

    public static NoType getInstance() {
        if(instance == null)
            return instance = new NoType();
        return instance;
    }


}
