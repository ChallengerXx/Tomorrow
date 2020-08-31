package com.structural.Decorator;

public class ShoesDecorator extends Decorator {


    public ShoesDecorator(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿双鞋子");
    }
}
