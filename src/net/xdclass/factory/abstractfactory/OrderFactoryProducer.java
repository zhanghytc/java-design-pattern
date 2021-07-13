package net.xdclass.factory.abstractfactory;

public class OrderFactoryProducer {
    private static OrderFactory orderFactory;
    public static OrderFactory getOrderFactory(String type) throws Exception {
        if(type.equalsIgnoreCase("alipay")) {
            orderFactory = new AlipayOrderFactory();
        } else if(type.equalsIgnoreCase("alipay")) {
            orderFactory = new WechatOrderFactory();
        } else {
            throw new Exception("不支持的类型...");
        }
        return orderFactory;
    }
}
