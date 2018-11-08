public class ActorType extends Type{

    public ActorType(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    @Override
    public int size() {
        return 0;
    }

    public int getBufferSize() {
        return bufferSize;
    }

    public void setBufferSize(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    private int bufferSize;

    @Override
    public boolean equals(Object other) {
        if(other instanceof ActorType){
            if(((ActorType) other).getBufferSize()==this.bufferSize)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Actor<"+Integer.toString(this.bufferSize)+">";
    }

    @Override
    public String getDefaultValue() {
        return "AC";
    }

}
