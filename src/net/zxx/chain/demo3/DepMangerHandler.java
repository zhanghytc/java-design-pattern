package net.zxx.chain.demo3;

public class DepMangerHandler extends Handler {

    public Object  handleRequest(RequestModel rm){
        if(FeeRequestModel.PRE_TYPE.equals(rm.getType())){
            //表示聚餐费用申请
            return handleFeeRequest(rm);
        } else{
            //其他的项目经理暂时不想处理
            return  super.handleRequest(rm);
        }
    }
    public Object handleFeeRequest(RequestModel rm){
        //先把通用的对象造回来
        FeeRequestModel fm = (FeeRequestModel)rm;
        String str = "";
        if(fm.getFee() < 2000){
            str = "部门经理同意 " + ((FeeRequestModel) rm).getUser() + "聚餐申请...,金额为:" + ((FeeRequestModel) rm).getFee();
        } else{
            if(successor != null){
                System.out.println("部门经理无权审评 " + ((FeeRequestModel) rm).getUser() + "的聚餐申请...");
                return successor.handleRequest(rm);
            }
        }
        return str;
    }





}
