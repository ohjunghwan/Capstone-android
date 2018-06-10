package com.example.jh.proto;


public class Menu {
    private String name;
    private String price;
    private String cal;


    private int imageId;

    public Menu(String name, String price, String cal, int imageId) {
        this.name = name;
        this.price = price;
        this.cal = cal;
        this.imageId = imageId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCal() {
        return cal;
    }

    public void setCal(String cal) {
        this.cal = cal;
    }


    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
