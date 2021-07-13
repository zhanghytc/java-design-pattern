package net.xdclass.factory.method;

public class Main {

    public static void main(String[] args) {
        PayFactory payFactory = new AliPayFactory();
        Pay aliPay = payFactory.getPay();
        aliPay.unifieorder();

        PayFactory wechatFactory = new WechatPayFactory();
        Pay wechatPay = wechatFactory.getPay();
        wechatPay.unifieorder();
    }
}
