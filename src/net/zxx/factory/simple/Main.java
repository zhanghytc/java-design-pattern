package net.zxx.factory.simple;

public class Main {

    public static void main(String[] args) {
        Pay pay = SimpleFactory.createPay("aliPay");
        pay.unifieorder();
        Pay wechatPay = SimpleFactory.createPay("aliPay");
        wechatPay.unifieorder();
    }
}
