package com.structural.Decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        People people = new ShoesDecorator(new SuitDecorator(new ShirtDecorator(new PantsDecorator(new Jane()))));
        people.wear();
    }
}
