package com.xcy.pojo;

public class Company {
    private int id;
    private String intro;//公司简介
    private String culture;//公司文化
    private String merit;//公司技术

    public Company() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getMerit() {
        return merit;
    }

    public void setMerit(String merit) {
        this.merit = merit;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", intro='" + intro + '\'' +
                ", culture='" + culture + '\'' +
                ", merit='" + merit + '\'' +
                '}';
    }
}
