package com.example.factories.simpleFactory.pizza;

public class NYCheesePizza extends Pizza{

    public NYCheesePizza(){
        name = "NYCheesePizza";
        dough = "Thin Crust";
        sauce = "Marinara Sauce";
        toppings.add("Cheese");
        System.out.println("This is a NYCheesePizza");
    }

}
