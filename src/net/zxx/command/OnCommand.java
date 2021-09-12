package net.zxx.command;

public class OnCommand implements Command{
    private ConditionReceiver receiver;
    public OnCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("空调开启命令!");
    }
}
