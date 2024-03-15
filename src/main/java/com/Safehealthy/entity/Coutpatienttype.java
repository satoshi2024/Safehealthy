package com.Safehealthy.entity;

public class Coutpatienttype {
    private Integer outpatientId;//番号
    private String projectName;//プロジェクト名
    private Integer unit;//単位
    private Integer bigprojectId;//プロジェクト分類
    private double price;//物価
    private String unitName;//単位
    private Integer  ostate;//プロジェクト状況

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getOutpatientId() {
        return outpatientId;
    }

    public void setOutpatientId(Integer outpatientId) {
        this.outpatientId = outpatientId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getBigprojectId() {
        return bigprojectId;
    }

    public void setBigprojectId(Integer bigprojectId) {
        this.bigprojectId = bigprojectId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
