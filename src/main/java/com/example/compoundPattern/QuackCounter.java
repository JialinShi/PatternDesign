package com.example.compoundPattern;

public class QuackCounter implements Quackable{

    Observable observable;
    Quackable duck;
    static int count = 0;

    public QuackCounter(Quackable duck){

        this.duck = duck;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        count++;
    }
    public static int getCount(){
        return count;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);

    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();

    }

    @Override
    public void removeObserver(Observer observer) {
        duck.removeObserver(observer);

    }
}
