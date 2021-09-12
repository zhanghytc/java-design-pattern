package net.zxx.chain.demo2;

/**
 *接受多个个请求-使用简单处理方式
 * 同一个职责链处理不同的业务请求,
 */
public class Client {
    public static void main(String[] args) {
        Handler pm = new ProjectMangerHandler();
        Handler dm = new DepManger();
        Handler gm = new GeneralManger();
        pm.setSuccessor(dm);
        dm.setSuccessor(gm);
        System.out.println("pm:" + pm);
        System.out.println("dm:" + dm);
        System.out.println("gm:" + gm);
//        //test
//        String res1 = pm.feeDeal("xiaozhang",200.0);
//        System.out.println("res1:" + res1);
//        String res2 = pm.feeDeal("lee",200.0);
//        System.out.println("res2:" + res2);
//
//
//        String res3 = pm.feeDeal("xiaoxiao",600.0);
//        System.out.println("res3:" + res3);
//        String res4 = pm.feeDeal("lee",800.0);
//        System.out.println("res4:" + res4);

        // test prefee
        Boolean res5 = pm.handPreRequest("xiaoxiao",100.0);
        System.out.println("res5:" + res5);
        Boolean res6 = pm.handPreRequest("lee",2800.0);
        System.out.println("res6:" + res6);

    }
}
