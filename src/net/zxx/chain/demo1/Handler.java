package net.zxx.chain.demo1;

/**
 * 定义责任对象接口
 */
public abstract class Handler {
    Handler successor = null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract String handleFeeRequest(String user, Double fee);
}
