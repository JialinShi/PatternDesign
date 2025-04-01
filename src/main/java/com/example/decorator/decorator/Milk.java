package com.example.decorator.decorator;

import com.example.decorator.beverage.Beverage;

public class Milk extends CondimentDecorator{

    public Milk(Beverage b) {
        super(b);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
    @Override
    public double cost(){
        double cost = 0.5;
        if(beverage.getSize() == Size.TALL){
            cost += 0;
        }else if(beverage.getSize() == Size.GRANDE){
            cost += 0.5;
        }else cost += 1;
        return beverage.cost() + cost;
    }
}
