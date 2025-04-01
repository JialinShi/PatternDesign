package com.example.factories.simpleFactory.pizza;

public class CheesePizza extends Pizza{


    public CheesePizza(){
        name = "NYCheesePizza";
        dough = "Thin Crust";
        sauce = "Marinara Sauce";
        toppings.add("Cheese");

        System.out.println("This is a CheesePizza");
    }

}
