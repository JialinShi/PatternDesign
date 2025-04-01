package com.example.factories.abstractFactory;

import com.example.factories.abstractFactory.pizza.CheesePizza;
import com.example.factories.abstractFactory.pizza.Pizza;

public abstract class PizzaStore {
    PizzaIngredientFactory factory;

    public Pizza createPizza() {
        Pizza pizza = new CheesePizza(factory);
        pizza.prepare();
        pizza.bake();
        pizza.boxing();
        return pizza;
    }

}
