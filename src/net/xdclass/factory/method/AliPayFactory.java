package net.xdclass.factory.method;

public class AliPayFactory implements PayFactory{
    @Override
    public Pay getPay() {
        return new Alipay();
    }
}
