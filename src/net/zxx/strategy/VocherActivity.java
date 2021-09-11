package net.zxx.strategy;

public class VocherActivity implements Strategy{

    private double vocher;

    public VocherActivity(double vocher) {
        this.vocher = vocher;
    }

    @Override
    public double computePrice(ProductOrder productOrder) {

        if(productOrder.getOldPrice() > vocher) {
            return productOrder.getOldPrice() - vocher;
        } else {
            return 0;
        }
    }
}
