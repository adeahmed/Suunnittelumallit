package ChainOfResponsibility;

abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract void handleRequest(double amount);
}
