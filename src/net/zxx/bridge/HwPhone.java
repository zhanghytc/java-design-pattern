package net.zxx.bridge;

public class HwPhone extends Phone{

    public  HwPhone(Color color) {
        super.setColor(color);
    }
    @Override
    public void run() {
        color.useColor();
        System.out.println("华为手机");
    }
}
