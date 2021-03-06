package net.zxx.factory.abstractfactory;

import net.zxx.factory.method.Pay;

public class Main {

    public static void main(String[] args) throws Exception {
        OrderFactory fctory = OrderFactoryProducer.getOrderFactory("alipay");
        Pay alipay = fctory.createPay().getPay();
        alipay.unifieorder();
        OrderFactory refundFactory = OrderFactoryProducer.getOrderFactory("alipay");
        Refund alipayRefund = refundFactory.createRefund().getRefund();
        alipayRefund.unifiyRefund();

    }
}
