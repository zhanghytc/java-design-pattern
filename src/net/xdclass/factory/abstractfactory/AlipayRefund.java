package net.xdclass.factory.abstractfactory;

public class AlipayRefund implements Refund {
    @Override
    public void unifiyRefund() {
        System.out.println("支付宝统一退款接口");
    }
}
