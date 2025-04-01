package com.example.template;

public class Tea extends BeverageMaking{

    @Override
    public void brew() {
        System.out.println("Steeping the tea.");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding lemon");
    }

    @Override
    public boolean customerNeedsCondiment(){
        return true;
    }
}
