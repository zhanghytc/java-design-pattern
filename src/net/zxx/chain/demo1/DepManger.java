package net.zxx.chain.demo1;

public class DepManger extends Handler {
    @Override
    public String handleFeeRequest(String user, Double fee) {
        String str = "";
        if("xiaozhang".equals(user)){
                if(fee < 1000){
                    str = "accept xiaoxiao de shenqing ...";
                }
                else{
                    if(this.successor != null){
                        return successor.handleFeeRequest(user,fee);
                    }
                }
        } else{
            str = "refuse shenqing not xiaoxiao";
        }
        return str;
    }
}
