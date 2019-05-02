package com.company;

public class Footwear {
    private int size;
    private String stle;
    private String matterial;
    private String brand;

    public Footwear(){

    }

    public Footwear(int size, String stle, String matterial, String brand) {
        this.size = size;
        this.stle = stle;
        this.matterial = matterial;
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getStle() {
        return stle;
    }

    public void setStle(String stle) {
        this.stle = stle;
    }

    public String getMatterial() {
        return matterial;
    }

    public void setMatterial(String matterial) {
        this.matterial = matterial;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
