package net.xdclass.factory.method;

public class WechatPayFactory implements PayFactory {
    @Override
    public Pay getPay() {
        return new WechatPay();
    }
}
