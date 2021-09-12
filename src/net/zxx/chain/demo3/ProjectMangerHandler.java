package net.zxx.chain.demo3;

public class ProjectMangerHandler extends Handler {

    public Object handleRequest(RequestModel rm){
        System.out.println("type: " + FeeRequestModel.PRE_TYPE);
        System.out.println("type2: " + rm.getType());
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
        if(fm.getFee() < 500){
            str = "项目经理同意 " + ((FeeRequestModel) rm).getUser() + "聚餐申请...";
        } else{
            if(successor != null){
                str = "项目经理无权审评 " + ((FeeRequestModel) rm).getUser() + "的聚餐申请...";
                return successor.handleRequest(rm);
            }
        }
        return str;
    }





}
