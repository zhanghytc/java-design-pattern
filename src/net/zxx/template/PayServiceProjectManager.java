package net.zxx.template;



public class PayServiceProjectManager extends AbstractProjectManager {
    @Override
    public void coding() {
        System.out.println("开发耗时30天");
    }

    @Override
    public void test() {

        System.out.println("功能测试，安全测试，压力测试");
    }

    @Override
    public void online() {

        System.out.println("全量上线");
    }
}
