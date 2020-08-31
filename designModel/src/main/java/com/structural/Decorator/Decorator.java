package com.structural.Decorator;

public class Decorator implements People {

    private People people;

    public Decorator(People people) {
        this.people = people;
    }

    @Override
    public void wear() {
        people.wear();
    }
}
