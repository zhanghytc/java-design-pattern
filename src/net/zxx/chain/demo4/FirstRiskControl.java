package net.zxx.chain.demo4;

public class FirstRiskControl extends RiskControllManager{

    public FirstRiskControl(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType().equals(RequestType.TRANSFER) && request.getMoney() < 1000) {
            //自己处理该请求
            System.out.println("普通风控,1000元以内直接转账");
        } else {
            //交给下一个handler处理
            if(nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}
