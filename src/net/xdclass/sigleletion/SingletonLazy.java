package net.xdclass.sigleletion;

/**
 * 小滴课堂,愿景：让技术不再难学
 * 单例例模式中的懒汉实现+双重检查锁定+内存模型
 *
 * @Description 单例设计模式 - 懒汉实现方式
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class SingletonLazy {
    private static  SingletonLazy instance;

    private SingletonLazy() {
    }

    /**
     * 第一种方式
     * 对外暴露一个方法获取类的对象
     *
     * 线程不安全，多线程下存在安全问题，也就是一个bug
     *
     */
//    public static SingletonLazy getInstance1() {
//        if(instance == null) {
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }

    /**
     * 第二种实现方式
     * 通过加锁 synchronized 保证单例
     * <p>
     * 采用synchronized 对方法加锁有很大的性能开销
     * <p>
     * 解决办法：锁粒度不要这么大
     *
     * @return
     */
    public synchronized static SingletonLazy getInstance2() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }


    /**
     * 第三种实现方式
     * DCL 双重检查锁定 （Double-Checked-Locking）,在多线程情况下保持⾼高性能
     * 这是否安全，instance = new SingletonLazy(); 并不不是原⼦子性操作
     * 1、分配空间给对象
     * 2、在空间内创建对象
     * 3、将对象赋值给引⽤用instance
     * 假如线程 1-》3-》2顺序，会把值写会主内存，其他程就会读取到instance最新的值，但是这个是不不完全的对象
     * * (指令重排)
     */
    public static SingletonLazy getInstance3() {
        //A,B
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }


    /**
     * volatile是Java提供的关键字，它具有可⻅见性和有序性
     * 指令重排序是JVM对语句句执⾏行行的优化，只要语句句间没有依赖，那JVM就有权对语句句进⾏行行优化
     * 禁⽌止了了指令重排
     * @return
     */
    private static volatile SingletonLazy instance1;
    public static  SingletonLazy getInstance4() {
        //A,B
        if (instance1 == null) {
            synchronized (SingletonLazy.class) {
                if (instance1 == null) {
                    instance1 = new SingletonLazy();
                }
            }
        }
        return instance1;
    }

    public void process() {
        System.out.println("对象调用成功...");
    }
}
