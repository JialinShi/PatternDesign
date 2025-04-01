package com.example.factories.simpleFactory.test;

import com.example.factories.simpleFactory.pizza.Pizza.Flavor;
import com.example.factories.simpleFactory.pizzaStore.NYSimplePizzaFactory;
import com.example.factories.simpleFactory.pizzaStore.PizzaStore;
import com.example.factories.simpleFactory.pizzaStore.SimplePizzaFactory;

public class TestPizzaStore {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new NYSimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza(Flavor.CHEESE);
    }

}
