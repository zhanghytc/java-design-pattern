package net.zxx.command;

/**
 *  第一次自己饰演，把AppInvoker 里面封装的command 封装到这里了
 */
public class ConditionReceiver {

    public void on(){
        System.out.println("空调开启了");
    }

    public void off(){
        System.out.println("空调关闭了");
    }

    public void cool(){
        System.out.println("空调开始制冷");
    }

    public void warm(){
        System.out.println("空调开始制暖");
    }

}
