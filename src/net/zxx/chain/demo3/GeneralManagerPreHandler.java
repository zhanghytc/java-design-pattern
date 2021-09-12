package net.zxx.chain.demo3;

/**
 * Created by xiaoxiao_zhang on 2017/8/8.
 */
public class GeneralManagerPreHandler extends Handler{

    public  Object handleRequest(RequestModel rm){
        Boolean res = false;
        PreRequestModel pr = (PreRequestModel)rm;
        if(PreRequestModel.type.equals(rm.getType())){
            if(pr.getFee() < 10000){
                System.out.println("项目经理同意" + pr.getUser() + ", 的差旅申请,金额为:" + pr.getFee());
                res = true;
            } else{
                if(successor != null){
                    System.out.println("项目经理无权审批" + pr.getUser() + ", 的差旅申请,金额为:" + pr.getFee() + ",继续向上提交...");
                    successor.handleRequest(rm);
                }
            }
        }
        return res;
    }
}

