package com.example.decorator.decorator;

import com.example.decorator.beverage.Beverage;

public class Soy extends CondimentDecorator{

    public Soy(Beverage b) {
        super(b);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    @Override
    public double cost(){
        return beverage.cost() + 1;
    }
}
