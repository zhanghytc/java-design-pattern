package net.zxx.chain.demo2;


public class DepManger extends Handler {
    @Override
    public String handFeeRequest(String user, Double fee) {
        String str = "";
        if("xiaoxiao".equals(user)){
                if(fee < 1000){
                    str = "accept xiaoxiao de shenqing ...";
                }
                else{
                    if(this.successor != null){
                        successor.handFeeRequest(user,fee);
                    }
                }
        } else{
            str = "refuse shenqing not xiaoxiao";
        }
        return str;
    }

    @Override
    public Boolean handPreRequest(String user, Double fee) {
        Boolean result = false;
        if(fee < 20000){
            System.out.println("部门经理同意申请...");
            result = true;
        }
        else{
            if(this.successor != null){
                System.out.println("部门经理无权处理申请,向上提交...");
                successor.handPreRequest(user,fee);
            }
        }
        return result;
    }
}
