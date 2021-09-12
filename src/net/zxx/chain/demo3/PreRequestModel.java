package net.zxx.chain.demo3;

/**
 * Created by xiaoxiao_zhang on 2017/8/8.
 */
public class PreRequestModel extends RequestModel {
    public static final String type ="prefee";

    private String user;
    private double fee;


    public String getUser() {
        return user;
    }

    public double getFee() {
        return fee;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
