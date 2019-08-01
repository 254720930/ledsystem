package com.xcy.pojo;

public class OnlineMessage {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String detail;
    private String address;
    private int goodsTypeId;
    private String purchaseCharacter;
    private String purchaseDate;
    private int payWayId;
    private String yourCompanyName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(int goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getPurchaseCharacter() {
        return purchaseCharacter;
    }

    public void setPurchaseCharacter(String purchaseCharacter) {
        this.purchaseCharacter = purchaseCharacter;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getPayWayId() {
        return payWayId;
    }

    public void setPayWayId(int payWayId) {
        this.payWayId = payWayId;
    }

    public String getYourCompanyName() {
        return yourCompanyName;
    }

    public void setYourCompanyName(String yourCompanyName) {
        this.yourCompanyName = yourCompanyName;
    }

    @Override
    public String toString() {
        return "OnlineMessage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", detail='" + detail + '\'' +
                ", address='" + address + '\'' +
                ", goodsTypeId=" + goodsTypeId +
                ", purchaseCharacter='" + purchaseCharacter + '\'' +
                ", purchaseDate='" + purchaseDate + '\'' +
                ", payWayId=" + payWayId +
                ", yourCompanyName='" + yourCompanyName + '\'' +
                '}';
    }
}
