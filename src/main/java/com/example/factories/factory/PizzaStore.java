package com.example.factories.factory;

import com.example.factories.simpleFactory.pizza.Pizza;
import com.example.factories.simpleFactory.pizza.Pizza.Flavor;

public abstract class PizzaStore {
    public void orderPizza(Flavor flavor){
        Pizza pizza = createPizza(flavor);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
    public abstract Pizza createPizza(Flavor flavor);
}
