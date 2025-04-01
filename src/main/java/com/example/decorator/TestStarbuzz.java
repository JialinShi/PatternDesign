package com.example.decorator;

import com.example.decorator.beverage.Beverage;
import com.example.decorator.beverage.Beverage.Size;
import com.example.decorator.beverage.DarkRoast;
import com.example.decorator.beverage.Espresso;
import com.example.decorator.decorator.Milk;
import com.example.decorator.decorator.Soy;


public class TestStarbuzz {

    public static void main(String[] args) {
        Beverage  drink = new Espresso();
        System.out.println(drink.getDescription() + " $" + drink.cost());
        drink.setSize(Size.GRANDE);
        System.out.println(drink.getDescription() + " $"+ drink.cost());

        Beverage drink2 = new DarkRoast();
        Beverage drink3 = new Milk(drink2);
        System.out.println(drink3.getDescription() + " $" + drink3.cost());

        drink2.setSize(Size.GRANDE);
        Beverage drink4 = new Milk(drink2);
        System.out.println(drink4.getDescription() + " $" + drink4.cost());

        Beverage drink5 =  new DarkRoast();
        drink5 = new Milk(drink5);
        drink5.setSize(Size.GRANDE);
        System.out.println(drink5.getDescription() + " $" + drink5.cost());

    }

}
