package com.example.factories.abstractFactory.Ingredients;

public class Cheddar extends Cheese {

    @Override
    public Cheese createCheese() {
        System.out.println("This is Cheddar");
        return new Cheddar();
    }
}
