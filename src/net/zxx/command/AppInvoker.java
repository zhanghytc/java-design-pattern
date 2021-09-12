package net.zxx.command;

public class AppInvoker {
    private Command onCommand;
    private Command offCommand;

    private Command coolCommand;
    private Command warmCommand;


    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }

    public void setCoolCommand(Command coolCommand) {
        this.coolCommand = coolCommand;
    }

    public void setWarmCommand(Command warmCommand) {
        this.warmCommand = warmCommand;
    }


    public void on() {
        onCommand.execute();
    }
    public void off() {
        offCommand.execute();
    }

    public void cool() {
        coolCommand.execute();
    }

    public void warm() {
        warmCommand.execute();
    }

}
