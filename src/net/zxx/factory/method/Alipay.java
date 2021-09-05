package net.zxx.factory.method;

public class Alipay implements Pay {
    @Override
    public void unifieorder() {
        System.out.println("支付宝支付 统一下单接口");
    }
}
