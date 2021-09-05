package net.zxx.factory.abstractfactory;

import net.zxx.factory.method.PayFactory;

public interface OrderFactory {
     PayFactory createPay();
     RefundFactory createRefund();
}
