package net.zxx.factory.abstractfactory;

public class AlipayRefundFactory implements RefundFactory{
    @Override
    public Refund getRefund() {
        return new AlipayRefund();
    }
}
