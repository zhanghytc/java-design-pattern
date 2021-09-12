package net.zxx.chain.demo4;

public abstract class RiskControllManager {

    private String name;

    protected RiskControllManager nextHandler;

    public abstract void handleRequest(Request request);

    public RiskControllManager(String name) {
        this.name = name;
    }

    public void setNextHandler(RiskControllManager nextHandler) {
        this.nextHandler = nextHandler;
    }
}
