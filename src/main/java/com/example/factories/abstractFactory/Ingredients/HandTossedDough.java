package com.example.factories.abstractFactory.Ingredients;

public class HandTossedDough extends Dough {

    @Override
    public Dough createDough() {
        System.out.println("this is HandTossedDough");
        return new HandTossedDough();
    }
}
