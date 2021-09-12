package net.zxx.chain.demo3;

/**
 * 定义通用的请求对象
 * 它对应的是不同的业务逻辑的处理,它只封装类型，与业务无关
 */
public class RequestModel {

    //表示具体的业务类型
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
