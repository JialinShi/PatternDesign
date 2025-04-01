package com.example.compoundPattern;

public class Quackologist implements Observer{


    @Override
    public void update(QuackObservable duck) {
        System.out.println("There is "+ duck + " just quacked");
    }
}
