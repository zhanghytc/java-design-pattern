package net.xdclass.factory.abstractfactory;

import net.xdclass.factory.method.AliPayFactory;
import net.xdclass.factory.method.PayFactory;

public class WechatOrderFactory implements OrderFactory{
    @Override
    public PayFactory createPay() {
        return new AliPayFactory();
    }

    @Override
    public RefundFactory createRefund() {
        return new AlipayRefundFactory();
    }
}