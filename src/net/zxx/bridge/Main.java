package net.zxx.bridge;

public class Main {
    public static void main(String[] args) {
        Phone phone = new HwPhone(new Red());
        phone.run();

        Phone phone1 = new MiPhone(new Yellow());
        phone1.run();
    }
}
