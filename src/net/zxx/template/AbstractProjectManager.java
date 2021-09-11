package net.zxx.template;

/**
 * 以后看到抽象类中一部分抽象类中实现，一部分子类具体实现，那就是模板设计模式
 */
public abstract class AbstractProjectManager {

    public final void processProject() {
        review();

        degisn();

        coding();

        test();

        online();
    }

    /**
     * 各个项目都需要评审,具体方法
     */
    public void review(){
        System.out.println("项目需求评审");
    }


    /**
     * 各个项目都需要设计，具体方法
     */
    public void degisn(){
        System.out.println("UI UE进行设计");
    }

    /**
     * 抽象方法，由就具体子类进行实现，编码耗时不一样
     */
    public abstract void coding();



    /**
     * 抽象方法，由就具体子类进行实现，测试有多种，自动化测试、安全测试、压力测试、手工测试
     */
    public abstract void test();


    /**
     * 抽象方法，由就具体子类进行实现，上线有全量发布，灰度发布，停机发布
     */
    public abstract void online();

}
