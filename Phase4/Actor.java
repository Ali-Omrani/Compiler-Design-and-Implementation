public class Actor {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBufferSize() {
        return bufferSize;
    }

    public void setBufferSize(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    public int getUnreadMessage() {
        return unreadMessage;
    }

    public void setUnreadMessage(int unreadMessage) {
        this.unreadMessage = unreadMessage;
    }

    private String name;
    private int bufferSize;
    private int unreadMessage;

    public boolean isHasInit() {
        return hasInit;
    }

    public void setHasInit(boolean hasInit) {
        this.hasInit = hasInit;
    }

    public int getInitId() {
        return initId;
    }

    public void setInitId(int initId) {
        this.initId = initId;
    }

    private boolean hasInit = false;
    private int initId = -1;

    public Actor(String name, int bufferSize) {
        this.name = name;
        this.bufferSize = bufferSize;
        this.unreadMessage = 0;
    }


    public void increaseUnreads() {
        unreadMessage++;
    }
}
