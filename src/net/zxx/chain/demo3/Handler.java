package net.zxx.chain.demo3;

/**
 * 定义责任对象接口
 */
public abstract class Handler {
    /**
     * 定义下一个处理请求对象
     */
    Handler successor = null;

    /**
     * 设置下一个处理请求对象
     * @return
     */
    public Handler getSuccessor() {
        return successor;
    }


    public void setSuccessor(Handler successor) {
        System.out.println("successor:" + successor);
        this.successor = successor;
    }

    /**
     * 通用的业务处理方法，不管是什么业务都封装在这个请求里面
     * @param rm
     * @return
     */
    public Object handleRequest(RequestModel rm){
        System.out.println("rm===" + rm.getType());
        System.out.println("handleRequest.successor： " + successor);
        if(successor != null){
            return successor.handleRequest(rm);
        } else{
            return "没有后续处理或者不支持这样的功能处理";
        }
    }

}
