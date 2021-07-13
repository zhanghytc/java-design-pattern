package net.xdclass.buildPattern;

public interface Builder {
    /**
     *细节方法
     */
    void buildCpu();

    void buildMainboard();

    void buildDisk();

    void buildPower();

    void buildMemory();

    Computer createComputer();

}
