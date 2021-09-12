package net.zxx.chain.demo4;

public class Request {
    private  RequestType requestType;
    private int money;

    public Request(RequestType requestType, int money) {
        this.requestType = requestType;
        this.money = money;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

