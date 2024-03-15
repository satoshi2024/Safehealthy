package com.Safehealthy.entity;



public class CRegisteredtype {
    private int registeredId;//タイプid
    private String type;//タイプ名
    private double price;//物価

    public int getRegisteredId() {
        return registeredId;
    }

    public void setRegisteredId(int registeredId) {
        this.registeredId = registeredId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
