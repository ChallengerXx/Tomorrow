package com.structural.Decorator;

public class SuitDecorator extends Decorator {

    public SuitDecorator(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿个西服");
    }
}
