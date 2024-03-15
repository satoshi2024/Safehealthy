package com.Safehealthy.entity;

import java.sql.Date;

public class ReportVo {
    private int reportId;//予約id
    private String reportName;//名
    private String sex;//SEX
    private int age;//年齢
    private double price;//値段
    private Date time;//タイム
    private String users;//オペレーター
    private Integer state;//タイプ
    private  Integer ddepartmentid;//診療科id
    private Integer ddoctorid;//医生id
    private Integer dredisteredid;//診療タイプid
    private String department;//診療科
    private String doctorName;//医生名
    private String type;//診療タイプ
    private String carid;//保険証ID
    private String phone;//電話
    private  Integer carido;//保険証正面
    private Integer caridt;//保険証裏面
    private Integer cc;//日付
    private String datime;
    private  String zhuan;

    public String getZhuan() {
        return zhuan;
    }

    public void setZhuan(String zhuan) {
        this.zhuan = zhuan;
    }

    public String getDatime() {
        return datime;
    }

    public void setDatime(String datime) {
        this.datime = datime;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public Integer getCarido() {
        return carido;
    }

    public void setCarido(Integer carido) {
        this.carido = carido;
    }

    public Integer getCaridt() {
        return caridt;
    }

    public void setCaridt(Integer caridt) {
        this.caridt = caridt;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDdepartmentid() {
        return ddepartmentid;
    }

    public void setDdepartmentid(Integer ddepartmentid) {
        this.ddepartmentid = ddepartmentid;
    }

    public Integer getDdoctorid() {
        return ddoctorid;
    }

    public void setDdoctorid(Integer ddoctorid) {
        this.ddoctorid = ddoctorid;
    }

    public Integer getDredisteredid() {
        return dredisteredid;
    }

    public void setDredisteredid(Integer dredisteredid) {
        this.dredisteredid = dredisteredid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
