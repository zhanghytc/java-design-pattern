package net.zxx.observer;

public class Main {

    public static void main(String[] args) {

        //创建一个主题，老板
        BossConcreteSubject subject = new BossConcreteSubject();

        //创建观察者，就是摸鱼的同事
        Observer lwObserver = new LWConcreteObserver();

        //创建观察者，就是摸鱼的同事
        Observer annaObserver = new AnnaConcreteObserver();

        //建立对应的关系，老板这个主题被同事进行观察
        subject.addObserver(lwObserver);
        subject.addObserver(annaObserver);

        //主题开始活动，里面会通知观察者（相当于发布消息）
        subject.doSomething();

    }
}
