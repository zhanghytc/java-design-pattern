package net.zxx.strategy;

public class DiscountActivity implements Strategy{

    private double rate;

    public DiscountActivity(double rate) {
        this.rate = rate;
    }

    @Override
    public double computePrice(ProductOrder productOrder) {
        double discount = productOrder.getOldPrice() * rate;
        return discount;
    }
}
