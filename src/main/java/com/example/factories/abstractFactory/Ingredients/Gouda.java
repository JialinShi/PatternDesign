package com.example.factories.abstractFactory.Ingredients;

public class Gouda extends Cheese {

    @Override
    public Cheese createCheese() {
        System.out.println("This is Gouda Cheese");
        return new Gouda();
    }
}
