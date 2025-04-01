package com.example.factories.simpleFactory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();
    public enum Flavor {CHEESE, VEGGIE, PEPPERONI}
    Flavor flavor = Flavor.CHEESE;

    public void prepare(){
        System.out.println(name + ", "+ dough + ", " + sauce);
        System.out.println("preparing");
    }
    public String getName(){
        return name;
    }
    public String getDough(){
        return dough;
    }
    public String getSauce(){
        return sauce;
    }
    public void bake(){
        System.out.println("baking");
    }
    public void cut(){
        System.out.println("cutting");
    }
    public void box(){
        System.out.println("boxing");
    }


}
