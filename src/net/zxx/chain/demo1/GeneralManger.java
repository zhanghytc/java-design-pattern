package net.zxx.chain.demo1;

public class GeneralManger extends Handler {
    @Override
    public String handleFeeRequest(String user, Double fee) {
        String str = "";
        if(fee < 10000){
            if("xiaozhang".equals(user)){
                str = "accept xiaozhang de shenqing...";
            } else{
                str = "refuse others shenqing...";
            }
        } else {
            if(this.successor != null){
                str = "总经理同意" + user + "的费用申请,金额为:" + fee;
                successor.handleFeeRequest(user,fee);
            }
        }
        return str;
    }
}
