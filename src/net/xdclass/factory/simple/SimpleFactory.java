package net.xdclass.factory.simple;

public class SimpleFactory {
    private static Pay pay;
    public static Pay createPay(String payType) {
        if (payType == null) return null;
        if(payType.equalsIgnoreCase("alipay")) {
            pay = new Alipay();
        } else if(payType.equalsIgnoreCase("wechat")) {
            pay = new WechatPay();
        }
        return pay;
    }
}
