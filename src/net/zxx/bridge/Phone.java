package net.zxx.bridge;

public abstract class Phone {
    /**
     * 通过组合的方式来桥接其他行为
     */
    protected Color color;

    abstract public void run();

    public void setColor(Color color) {
        this.color = color;
    }
}
