package com.Safehealthy.entity;

public class CCashier {
    private int cashier;//処方id
    private  Integer reportId;//予約id
    private String durgname;//薬剤名
    private int durgnum;//薬剤数
    private double repiceprice;//物価
    private double repicetotal;//小計
    private Integer state;//ステータス
    private Integer  ostate;//プロジェクト状況
    private String jie;
    private Integer mstate;

    public Integer getMstate() {
        return mstate;
    }

    public void setMstate(Integer mstate) {
        this.mstate = mstate;
    }

    public String getJie() {
        return jie;
    }

    public void setJie(String jie) {
        this.jie = jie;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public int getCashier() {
        return cashier;
    }

    public void setCashier(int cashier) {
        this.cashier = cashier;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public String getDurgname() {
        return durgname;
    }

    public void setDurgname(String durgname) {
        this.durgname = durgname;
    }

    public int getDurgnum() {
        return durgnum;
    }

    public void setDurgnum(int durgnum) {
        this.durgnum = durgnum;
    }

    public double getRepiceprice() {
        return repiceprice;
    }

    public void setRepiceprice(double repiceprice) {
        this.repiceprice = repiceprice;
    }

    public double getRepicetotal() {
        return repicetotal;
    }

    public void setRepicetotal(double repicetotal) {
        this.repicetotal = repicetotal;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
