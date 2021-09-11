package net.zxx.proxy;

public class DigitalSellProxy implements DigitalSell{
    @Override
    public void sell() {
        //代理对象比真实对象多了些功能，扩展了原有对象没有的功能
        selectAddress();
        makeAd();
        System.out.println("代理对象销售华为手机");
    }

    public void makeAd(){
        System.out.println("做广告");
    }

    public void selectAddress() {
        System.out.println("选择一个人流量高的地方");
    }
}
