package net.zxx.factory.simple;

public class WechatPay implements Pay{
    @Override
    public void unifieorder() {
        System.out.println("微信支付...");
    }
}
