package net.zxx.chain.demo2;

public class ProjectMangerHandler extends Handler {
    @Override
    public String handFeeRequest(String user, Double fee) {
        String str = "";
        if(fee < 500){
            if("xiaozhang".equals(user)){
                str = "accept xiaozhang de shenqing...";
            } else{
                str = "refuse others shenqing...";
            }
        } else {
            if(this.successor != null){
                return successor.handFeeRequest(user,fee);
            }
        }
        return str;
    }

    @Override
    public Boolean handPreRequest(String user, Double fee) {
        Boolean result = false;
        if(fee < 500){
            System.out.println("项目经理同意申请...");
            result = true;
        }
        else{
            if(this.successor != null){
                System.out.println(" 项目经理无权处理申请,向上提交...");
                return successor.handPreRequest(user,fee);
            }
        }
        return result;
    }
}
