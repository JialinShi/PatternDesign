package com.example.decorator.beverage;

public class Espresso extends Beverage{

    public Espresso(){
        this.description = "Espresso";
    }
    @Override
    public double cost() {
        double cost = 1.99;
        if(this.getSize() == Size.TALL){
            cost += 0 ;
        }else if(this.getSize() == Size.GRANDE){
            cost += 0.25;
        }else cost += 0.5;
        return cost;
    }
}
