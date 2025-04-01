package com.example.adapter.duck;

public class Adapter implements  Duck{
    Turkey turkey;

    public Adapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 3; i++){
            turkey.flyShortDistance();
        }
    }
}
