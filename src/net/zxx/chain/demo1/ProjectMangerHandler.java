package net.zxx.chain.demo1;

public class ProjectMangerHandler extends Handler {
    @Override
    public String handleFeeRequest(String user, Double fee) {
        String str = "";
        if(fee < 500){
            if("xiaozhang".equals(user)){
                str = "accept xiaozhang de shenqing...";
            } else{
                str = "refuse others shenqing...";
            }
        } else {
            if(this.successor != null){
                str = successor.handleFeeRequest(user,fee);
            }
        }
        return str;
    }
}
