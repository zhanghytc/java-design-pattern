package net.zxx.decorator;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 具体的被装饰者，ConcreteComponent
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class SmallBike implements Bike{

    private String description = "小号自行车";

    @Override
    public String getDescription() {
        return description;
    }

    /**
     * 100元是小号自行车的价格
     * @return
     */
    @Override
    public int getPrice() {
        return 200;
    }
}
