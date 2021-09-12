package net.zxx.command;

public class CoolCommand implements Command{

    private ConditionReceiver receiver;

    public CoolCommand(ConditionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("空调制冷命令!");
    }
}
