package net.zxx.factory.method;

public class WechatPay implements Pay {
    @Override
    public void unifieorder() {
        System.out.println("微信支付 统一下单接口...");
    }
}
