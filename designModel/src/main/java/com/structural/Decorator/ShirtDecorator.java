package com.structural.Decorator;

public class ShirtDecorator extends Decorator {


    public ShirtDecorator(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿个衬衫");
    }
}
