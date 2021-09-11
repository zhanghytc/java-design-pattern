package net.zxx.proxy;

public class Main {
    public static void main(String[] args) {
        DigitalSell digitalSell = new DigitalSellReal();
        digitalSell.sell();

        DigitalSell sell = new DigitalSellProxy();
        sell.sell();
    }
}
