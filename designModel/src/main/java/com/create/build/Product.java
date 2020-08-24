package com.create.build;

public class Product {

    private String name;

    private String expiryDate;

    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
