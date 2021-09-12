package net.zxx.chain.demo1;

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
        //test
        String res1 = pm.handleFeeRequest("xiaozhang",200.0);
        System.out.println("res1:" + res1);
        String res2 = pm.handleFeeRequest("lee",200.0);
        System.out.println("res2:" + res2);


        String res3 = pm.handleFeeRequest("xiaoxiao",600.0);
        System.out.println("res3:" + res3);
        String res4 = pm.handleFeeRequest("lee",800.0);
        System.out.println("res4:" + res4);

        String res5 = pm.handleFeeRequest("xiaozhang",100.0);
        System.out.println("res5:" + res5);
        String res6 = pm.handleFeeRequest("xiaozhang",2800.0);
        System.out.println("res6:" + res6);

    }
}
