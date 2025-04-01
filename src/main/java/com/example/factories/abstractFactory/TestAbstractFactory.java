package com.example.factories.abstractFactory;


public class TestAbstractFactory {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        store.createPizza();

        PizzaStore store2 = new ChicagoPizzaStore();
        store2.createPizza();

    }

}
