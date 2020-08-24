package com.create.build;

public class BigProductBuilder extends ProductBuilder {
    @Override
    void buildName() {
        product.setName("大号");
    }

    @Override
    void buildExpiryDate() {
        product.setExpiryDate("一年");
    }

    @Override
    void buildSize() {
        product.setSize("Big");
    }
}
