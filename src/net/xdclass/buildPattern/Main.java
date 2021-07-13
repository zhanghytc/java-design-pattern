package net.xdclass.buildPattern;

public class Main {
    public static void main(String[] args) {
       Director director = new Director();
       Computer highComputer = director.craete(new HighComputerBuilder());
       System.out.println(highComputer);
       Computer lowComputer = director.craete(new LowComputerBuilder());
        System.out.println(lowComputer);
    }
}
