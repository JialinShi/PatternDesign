package com.example.compoundPattern;



public class MallardDuck implements Quackable{
    Observable observable ;

    public  MallardDuck(){
        observable = new Observable(this);
    }


    @Override
    public void quack() {
        System.out.println("Mallard Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void removeObserver(Observer observer) {
        observable.removeObserver(observer);

    }
}
