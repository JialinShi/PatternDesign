package com.example.strategy.duck;

import com.example.strategy.behavior.FlyWithWings;
import com.example.strategy.behavior.Quack;

/**具体的鸭子类*/
public class MallarDuck extends Duck{

    public MallarDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallar duck!");
    }
}
