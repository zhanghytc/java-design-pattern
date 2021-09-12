package net.zxx.chain.demo3;

/**
 *接受多个个请求
 * 同一个职责链处理不同的业务请求,
 *
 */
public class Client {
    public static void main(String[] args) {
        Handler pm = new ProjectMangerHandler();
        Handler dm = new DepMangerHandler();
        Handler gm = new GeneralMangerHandler();
        pm.setSuccessor(dm);
        dm.setSuccessor(gm);
        System.out.println("pm:" + pm);
        System.out.println("dm:" + dm);
        System.out.println("gm:" + gm);

//        //开始测试聚餐费用申请
//        FeeRequestModel fm = new FeeRequestModel();
//        fm.setUser("xiaoxiao");
//        fm.setFee(300.10);
//        fm.setType("fee");
//        //调用处理
//        String ret1 = (String) pm.handleRequest(fm);
//        System.out.println("ret1:" + ret1);
//
//        fm.setUser("xiaoxiao");
//        fm.setFee(800.10);
//        //调用处理
//        String ret2 = (String) pm.handleRequest(fm);
//        System.out.println("ret2:" + ret2);
//
//
//        fm.setUser("xiaoxiao");
//        fm.setFee(12000.10);
//        //调用处理
//        String ret3 = (String) pm.handleRequest(fm);
//        System.out.println("ret3:" + ret3);

        PreRequestModel prm = new PreRequestModel();
        prm.setType("prefee");
        prm.setUser("zxx");
        prm.setFee(100.0);
        Handler prePm = new ProjectMangerPreHandler();
        Handler preDm = new DepManagerPreHandler();
        Handler preGm = new GeneralManagerPreHandler();

        prePm.setSuccessor(preDm);
        preDm.setSuccessor(preGm);

        //test1
        prm.setType("prefee");
        prm.setUser("zxx");
        prm.setFee(100.0);
        prePm.handleRequest(prm);

        //test1
        prm.setType("prefee");
        prm.setUser("leo");
        prm.setFee(800.0);
        prePm.handleRequest(prm);

        prm.setType("prefee");
        prm.setUser("steven");
        prm.setFee(5400.0);
        prePm.handleRequest(prm);
    }
}
