package net.zxx.command;

public class Main {
    public static void main(String[] args) {

        //创建接收者,空调就是接收者
        ConditionReceiver receiver = new ConditionReceiver();

        //创建命令对象
        Command onCommand = new OnCommand(receiver);
        Command offCommand = new OffCommand(receiver);
        Command coolCommand = new CoolCommand(receiver);
        Command warmCommand = new WarmCommand(receiver);

        //创建请求者,把命令对象设置进去,app 就是请求发起者
        AppInvoker invoker = new AppInvoker();
        invoker.setOnCommand(onCommand);
        invoker.setOffCommand(offCommand);
        invoker.setCoolCommand(coolCommand);
        invoker.setWarmCommand(warmCommand);

        invoker.on();
        invoker.off();
        invoker.cool();
        invoker.warm();


    }
}
