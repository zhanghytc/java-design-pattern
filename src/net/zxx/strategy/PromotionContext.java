package net.zxx.strategy;

public class PromotionContext {
    public Strategy strategy;

    public PromotionContext(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 根据策略计算最终的价格
     * 根据传入的对象进行不同策略的计算
     * @param productOrder
     * @return
     */
    public double executeStrategy(ProductOrder productOrder) {
        return  strategy.computePrice(productOrder);
    }
}
