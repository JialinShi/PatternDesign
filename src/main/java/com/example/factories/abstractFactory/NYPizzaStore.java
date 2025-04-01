package com.example.factories.abstractFactory;

public class NYPizzaStore extends PizzaStore{

    public NYPizzaStore(){
        factory = new NYIngredientFactory();
    }

}
