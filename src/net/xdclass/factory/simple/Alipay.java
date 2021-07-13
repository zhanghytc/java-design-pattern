package net.xdclass.factory.simple;

public class Alipay implements Pay{
    @Override
    public void unifieorder() {
        System.out.println("支付宝支付...");
    }
}
