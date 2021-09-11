package net.zxx.strategy;

public class Main {
    public static void main(String[] args) {
        ProductOrder productOrder = new ProductOrder(800,1,23);

        Strategy normalStrategy = new NormalActivity();
        double normalPrice = normalStrategy.computePrice(productOrder);
        System.out.println("normalPrice:" + normalPrice);

        Strategy discountStrategy = new DiscountActivity(0.8);
        double discountPrice = discountStrategy.computePrice(productOrder);
        System.out.println("discountPrice:" + discountPrice);

        Strategy vocherStrategy = new VocherActivity(200);
        double vocherPrice = vocherStrategy.computePrice(productOrder);
        System.out.println("vocherPrice:" + vocherPrice);
    }
}
