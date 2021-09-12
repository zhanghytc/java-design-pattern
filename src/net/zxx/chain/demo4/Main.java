package net.zxx.chain.demo4;

public class Main {
    public static void main(String[] args) {
        Request request = new Request(RequestType.TRANSFER,20000);
        RiskControllManager lowRiskControllManager = new FirstRiskControl("初级风控");
        RiskControllManager middleRiskControllManager = new SecondRiskControl("中级风控");
        RiskControllManager highRiskControllManager = new ThirdRiskControl("高级风控");

        lowRiskControllManager.setNextHandler(middleRiskControllManager);
        middleRiskControllManager.setNextHandler(highRiskControllManager);

        lowRiskControllManager.handleRequest(request);
    }
}
