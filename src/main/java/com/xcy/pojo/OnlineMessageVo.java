package com.xcy.pojo;

public class OnlineMessageVo extends OnlineMessage {
    private String goodsType;
    private String payWay;

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    @Override
    public String toString() {
        return "OnlineMessageVo{" +
                "goodsType='" + goodsType + '\'' +
                ", payWay='" + payWay + '\'' +
                '}';
    }
}
