package net.zxx.chain.demo4;

public class ThirdRiskControl extends RiskControllManager{

    public ThirdRiskControl(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType().equals(RequestType.TRANSFER) && request.getMoney() > 10000) {
            //自己处理该请求
            System.out.println("高级风控,手机验证码 + 密码验证 + 人脸识别验证");
            System.out.println("request:" + request.getRequestType() + "," + request.getMoney());
        } else {
            //交给下一个handler处理
            if(nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }
}
