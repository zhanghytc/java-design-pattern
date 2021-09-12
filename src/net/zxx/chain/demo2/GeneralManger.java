package net.zxx.chain.demo2;


public class GeneralManger extends Handler {
    @Override
    public String handFeeRequest(String user, Double fee) {
        String str = "";
        if(fee > 1000){
            if("xiaozhang".equals(user)){
                str = "accept xiaozhang de shenqing...";
            } else{
                str = "refuse others shenqing...";
            }
        } else {
            if(this.successor != null){
                System.out.println("this.successor:" + this.successor);
                System.out.println("successor:" + successor);
                successor.handFeeRequest(user,fee);
            }
        }
        return str;
    }

    @Override
    public Boolean handPreRequest(String user, Double fee) {
        Boolean result = false;
        if(fee < 2000){
            System.out.println("总经理同意申请...");
            result = true;
        }
        else{
            if(this.successor != null){
                successor.handPreRequest(user,fee);
            }
        }
        return result;
    }

}
