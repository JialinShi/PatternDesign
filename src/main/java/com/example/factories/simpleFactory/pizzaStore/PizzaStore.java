package com.example.factories.simpleFactory.pizzaStore;

import com.example.factories.simpleFactory.pizza.Pizza;
import com.example.factories.simpleFactory.pizza.Pizza.Flavor;

public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(Flavor flavor){
        Pizza pizza = simplePizzaFactory.createPizza(flavor);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }




}
