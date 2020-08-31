package com.structural.Decorator;

public class PantsDecorator extends Decorator {


    public PantsDecorator(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿裤子");
    }
}
