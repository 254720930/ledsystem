package com.xcy.pojo;

public class Data {
    private int dataTypeId;
    private int dataId;
    private String dataTitle;
    private String downloadUrl;
    private String dataUploadTime;

    private String dataTypeName;

    public int getDataTypeId() {
        return dataTypeId;
    }

    public void setDataTypeId(int dataTypeId) {
        this.dataTypeId = dataTypeId;
    }

    public int getDataId() {
        return dataId;
    }

    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    public String getDataTitle() {
        return dataTitle;
    }

    public void setDataTitle(String dataTitle) {
        this.dataTitle = dataTitle;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getDataUploadTime() {
        return dataUploadTime;
    }

    public void setDataUploadTime(String dataUploadTime) {
        this.dataUploadTime = dataUploadTime;
    }

    public String getDataTypeName() {
        return dataTypeName;
    }

    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }
}
