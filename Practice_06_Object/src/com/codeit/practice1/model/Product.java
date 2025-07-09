package com.codeit.practice1.model;

public class Product {
    private String pName;
    private int price;
    private String brand;

    public Product() {
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pName='" + pName + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
