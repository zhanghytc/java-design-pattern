package net.xdclass.factory.abstractfactory;

public class WechatRefund implements Refund{
    @Override
    public void unifiyRefund() {
        System.out.println("微信支付统一退款接口...");
    }
}
