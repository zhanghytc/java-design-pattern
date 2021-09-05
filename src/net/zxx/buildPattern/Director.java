package net.zxx.buildPattern;

public class Director {
    public Computer craete(Builder builder){
        builder.buildMemory();
        builder.buildCpu();
        builder.buildMainboard();
        builder.buildDisk();
        builder.buildPower();
        return builder.createComputer();
    }
}
