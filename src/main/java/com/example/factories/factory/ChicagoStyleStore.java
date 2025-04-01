package com.example.factories.factory;

import com.example.factories.simpleFactory.pizza.CheesePizza;
import com.example.factories.simpleFactory.pizza.PepperoniPizza;
import com.example.factories.simpleFactory.pizza.Pizza;
import com.example.factories.simpleFactory.pizza.Pizza.Flavor;
import com.example.factories.simpleFactory.pizza.VeggiePizza;

public class ChicagoStyleStore extends PizzaStore{
    public ChicagoStyleStore(){
        System.out.println("Welcome to ChicagoStyleStore.");
    }

    @Override
    public Pizza createPizza(Flavor flavor) {
        Pizza pizza = null;
        if(flavor == Flavor.CHEESE){
            pizza = new CheesePizza();
        }else if(flavor == Flavor.PEPPERONI){
            pizza = new PepperoniPizza();
        }else pizza = new VeggiePizza();
        return pizza;
    }
}
