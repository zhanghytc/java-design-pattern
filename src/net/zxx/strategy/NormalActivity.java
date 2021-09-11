package net.zxx.strategy;

public class NormalActivity implements Strategy{

    @Override
    public double computePrice(ProductOrder productOrder) {
        return productOrder.getOldPrice();
    }
}
