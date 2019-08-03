package com.xcy.pojo;

/**
 * @Auther: http://www/qfedu.com
 * @Date: 2019/8/3
 * @Description:
 * @version: 1.0
 */
public class GoodsType {

    private int id;
    private String goodsType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "id=" + id +
                ", goodsType='" + goodsType + '\'' +
                '}';
    }
}
