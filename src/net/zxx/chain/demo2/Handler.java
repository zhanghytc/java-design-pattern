package net.zxx.chain.demo2;

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

    public abstract String handFeeRequest(String user, Double fee);

    public abstract Boolean handPreRequest(String user, Double fee);


}
