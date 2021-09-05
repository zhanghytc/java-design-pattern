package net.zxx.adapter.cls;

/**
 *想将⼀一个类转换成满⾜足另⼀一个新接⼝口的类时，可以使⽤用类的适配器器模式，创建⼀一个新类，继承原有的类，实现新的接⼝口即可
 * /**
 */
public class Adapter extends OldModule implements TargetModule{
    /**
     * 新的方法，和老的类方法不一样
     */
    @Override
    public void methodB() {
        System.out.println("Adapter methodB");
    }

    /**
     * 新的方法，和老的类方法不一样
     */
    @Override
    public void methodC() {
        System.out.println("Adapter methodC");
    }
}
