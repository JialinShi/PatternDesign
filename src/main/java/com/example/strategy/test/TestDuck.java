package com.example.strategy.test;

import com.example.strategy.behavior.Quack;
import com.example.strategy.duck.Duck;
import com.example.strategy.duck.MallarDuck;
import com.example.strategy.duck.RubberDuck;

public class TestDuck {

    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        rubber.setQuackBehavior(new Quack());
        rubber.performQuack();
    }

}
