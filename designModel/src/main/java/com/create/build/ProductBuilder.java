package com.create.build;

public abstract class ProductBuilder {

    Product product = new Product();

    abstract void buildName();

    abstract void buildExpiryDate();

    abstract void buildSize();

    public Product getProduct(){
        return product;
    }
}
