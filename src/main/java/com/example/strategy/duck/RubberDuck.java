package com.example.strategy.duck;

import com.example.strategy.behavior.FlyNoWay;
import com.example.strategy.behavior.MuteQuack;

/**具体的鸭子类*/
public class RubberDuck extends Duck{

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duck.");
    }
}
