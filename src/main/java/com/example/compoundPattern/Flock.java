package com.example.compoundPattern;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable{

    List<Quackable> quackers;

    public Flock(){
        quackers = new ArrayList<>();
    }

    public void addQuacker(Quackable quackable){
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable duck = iterator.next();
            duck.quack();
//            duck.notifyObservers();
        }

    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while(iterator.hasNext()){
            iterator.next().registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }

    @Override
    public void removeObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            iterator.next().removeObserver(observer);  // 递归移除观察者
        }
    }
}
