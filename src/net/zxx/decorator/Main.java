package net.zxx.decorator;

public class Main {
    public static void main(String[] args) {
        //选一个自行车
        Bike bike = new BigBike();
        //搭配了一个防爆胎
        bike = new RSCBikeDecorator(bike);
        System.out.println(bike.getDescription() + ",价格:" + bike.getPrice());


    }
}
