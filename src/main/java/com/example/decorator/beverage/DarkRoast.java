package com.example.decorator.beverage;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        this.description = "DarkRoast";
    }

    @Override
    public double cost() {
        double cost = 1.5;
        if(this.getSize() == Size.TALL){
            cost += 0;
        }else if(this.getSize() == Size.GRANDE){
            cost += 0.5;
        }else cost += 1;
        return cost;
    }
}
