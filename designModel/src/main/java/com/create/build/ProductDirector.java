package com.create.build;

public class ProductDirector {

    private ProductBuilder builder;

    public ProductDirector(ProductBuilder builder) {
        this.builder = builder;
    }

    public Product construct(){
        builder.buildName();
        builder.buildExpiryDate();
        builder.buildSize();
        return builder.getProduct();
    }

    public static void main(String[] args) {
        System.out.println(new ProductDirector(new BigProductBuilder()).construct());
    }
}
