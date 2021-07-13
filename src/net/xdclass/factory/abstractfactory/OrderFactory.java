package net.xdclass.factory.abstractfactory;

import net.xdclass.factory.method.PayFactory;

public interface OrderFactory {
     PayFactory createPay();
     RefundFactory createRefund();
}
