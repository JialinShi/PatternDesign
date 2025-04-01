package com.example.factories.abstractFactory.pizza;

import com.example.factories.abstractFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory factory;
    public CheesePizza(PizzaIngredientFactory factory){
        this.factory = factory;
        name = "CheesePizza";
    }


    @Override
    public void prepare() {
        dough =  factory.createDough();
        cheese = factory.createCheese();
    }
}
