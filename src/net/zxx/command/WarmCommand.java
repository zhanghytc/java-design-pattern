package net.zxx.command;

public class WarmCommand implements Command{

    private ConditionReceiver receiver;

    public WarmCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("空调制热命令!");
    }
}
