package com.example.factories.abstractFactory.Ingredients;

public class ThinCrustDough extends Dough {

    public ThinCrustDough(){};

    @Override
    public Dough createDough() {
        System.out.println("this is ThinCrustDough");
        return  new ThinCrustDough();
    }
}
