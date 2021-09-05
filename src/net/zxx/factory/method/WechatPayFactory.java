package net.zxx.factory.method;

public class WechatPayFactory implements PayFactory {
    @Override
    public Pay getPay() {
        return new WechatPay();
    }
}
