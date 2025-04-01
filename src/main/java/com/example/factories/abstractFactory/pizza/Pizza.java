package com.example.factories.abstractFactory.pizza;

import com.example.factories.abstractFactory.Ingredients.Cheese;
import com.example.factories.abstractFactory.Ingredients.Dough;

public abstract class Pizza {
    String name;
    Dough dough;
    Cheese cheese;



    public abstract void prepare();

    public void bake(){
        System.out.println("Now baking" );
    }

    public void boxing(){
        System.out.println("Now boxing");
    }



}
