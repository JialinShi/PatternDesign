package com.example.factories.simpleFactory.pizzaStore;

import com.example.factories.simpleFactory.pizza.Pizza;
import com.example.factories.simpleFactory.pizza.Pizza.Flavor;
import com.example.factories.simpleFactory.pizza.NYCheesePizza;

public class NYSimplePizzaFactory extends SimplePizzaFactory{

    public Pizza createPizza(Flavor flavor){
        Pizza pizza = null;
        if(flavor == Flavor.CHEESE){
            pizza = new NYCheesePizza();
        }
        return pizza;
    }

}
