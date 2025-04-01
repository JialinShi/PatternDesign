package com.example.factories.factory;

import com.example.factories.simpleFactory.pizza.Pizza.Flavor;

public class TestFactory {

    public static void main(String[] args) {
        PizzaStore store = new NYStylePizzaStore();
        store.orderPizza(Flavor.PEPPERONI);

        PizzaStore store2 = new ChicagoStyleStore();
        store2.orderPizza(Flavor.CHEESE);
    }

}
