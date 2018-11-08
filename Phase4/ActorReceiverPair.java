public class ActorReceiverPair {
    private String actorName;
    private String receiverSign;
    private int argumentCount;

    public ActorReceiverPair(String actorName, String receiverSign, int argumentCount) {
        this.actorName = actorName;
        this.receiverSign = receiverSign;
        this.argumentCount = argumentCount;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getReceiverSign() {
        return receiverSign;
    }

    public void setReceiverSign(String receiverSign) {
        this.receiverSign = receiverSign;
    }

    public int getArgumentCount() {
        return argumentCount;
    }

    public void setArgumentCount(int argumentCount) {
        this.argumentCount = argumentCount;
    }
}
