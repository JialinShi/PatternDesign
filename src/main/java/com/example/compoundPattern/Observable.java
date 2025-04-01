package com.example.compoundPattern;

import com.example.strategy.behavior.Quack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable{
    List<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck){
        this.duck = duck;
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while(iterator.hasNext()){
            Observer observer = iterator.next();
            observer.update(duck);
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
