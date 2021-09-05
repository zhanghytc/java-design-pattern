package net.zxx.factory.abstractfactory;

import net.zxx.factory.method.AliPayFactory;
import net.zxx.factory.method.PayFactory;

public class AlipayOrderFactory implements OrderFactory{
    @Override
    public PayFactory createPay() {
        return new AliPayFactory();
    }

    @Override
    public RefundFactory createRefund() {
        return new AlipayRefundFactory();
    }
}
