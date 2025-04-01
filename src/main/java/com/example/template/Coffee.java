package com.example.template;

public class Coffee extends BeverageMaking{


    @Override
    public void brew() {
        System.out.println("brewing coffee.");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding sugar and milk.");
    }

    @Override
    public boolean customerNeedsCondiment(){
        return true;
    }

}
