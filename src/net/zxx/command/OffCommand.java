package net.zxx.command;

public class OffCommand implements Command{

    private ConditionReceiver receiver;
    public OffCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("空调关闭命令!");
    }
}
