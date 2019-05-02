package com.company;

public class Pants {
    private int size;
    private String color;
    private String material;
    private String type;

    public Pants (){

    }

    public Pants ( int size, String color, String material, String type) {
        this.size = size;
        this.color = color;
        this.material = material;
        this.type = type;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
