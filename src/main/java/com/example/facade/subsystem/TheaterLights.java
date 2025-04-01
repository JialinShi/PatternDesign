package com.example.facade.subsystem;

public class TheaterLights {
    int val;
    public void on(){
        val = 100;
        System.out.println("TheaterLight is on.");
    }

    public void off(){
        val = 0;
        System.out.println("TheaterLight is off.");
    }

    public void dim(int val){
        this.val = val;
        System.out.println("TheaterLight is " + val);
    }


}
