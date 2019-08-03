package com.xcy.pojo;

import java.util.List;

/**
 * @Auther: http://www/qfedu.com
 * @Date: 2019/8/1
 * @Description:
 * @version: 1.0
 */
public class Goods {

    private int id;
    private String goodsName;
    private String goodsModel;
    private String goodsType;
    private String goodsTypeId;
    private String goodsImgUrl;
    private String pixelPitch;
    private String goodsParametersImgUrl;
    private String goodsFeature;
    private List<String> goodsImg;

    public void setGoodsImg(List<String> goodsImg) {
        this.goodsImg = goodsImg;
    }

    public List<String> getGoodsImg() {
        return goodsImg;
    }

    public int getId() {
        return id;
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsModel() {
        return goodsModel;
    }

    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsImgUrl() {
        return goodsImgUrl;
    }

    public void setGoodsImgUrl(String goodsImgUrl) {
        this.goodsImgUrl = goodsImgUrl;
    }

    public String getPixelPitch() {
        return pixelPitch;
    }

    public void setPixelPitch(String pixelPitch) {
        this.pixelPitch = pixelPitch;
    }

    public String getGoodsParametersImgUrl() {
        return goodsParametersImgUrl;
    }

    public void setGoodsParametersImgUrl(String goodsParametersImgUrl) {
        this.goodsParametersImgUrl = goodsParametersImgUrl;
    }

    public String getGoodsFeature() {
        return goodsFeature;
    }

    public void setGoodsFeature(String goodsFeature) {
        this.goodsFeature = goodsFeature;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsModel='" + goodsModel + '\'' +
                ", goodsType='" + goodsType + '\'' +
                ", goodsImgUrl='" + goodsImgUrl + '\'' +
                ", pixelPitch='" + pixelPitch + '\'' +
                ", goodsParametersImgUrl='" + goodsParametersImgUrl + '\'' +
                ", goodsFeature='" + goodsFeature + '\'' +
                '}';
    }
}
