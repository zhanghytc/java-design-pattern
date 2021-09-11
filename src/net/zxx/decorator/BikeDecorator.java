package net.zxx.decorator;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Version 1.0
 **/

public class BikeDecorator implements Bike {

    private String description = "我只是装饰器，啥都不表示，子类帮我传递";




    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
