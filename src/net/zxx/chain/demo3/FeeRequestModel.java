package net.zxx.chain.demo3;

/**
 * 封装跟聚餐申请业务相关的请求数据
 */
public class FeeRequestModel extends RequestModel {
    /**
     * 约定具体的业务类型
     */
    public final static String PRE_TYPE = "fee";

    private  String user;
    private  Double fee;

    public String getUser() {
        return user;
    }

    public Double getFee() {
        return fee;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }
}
