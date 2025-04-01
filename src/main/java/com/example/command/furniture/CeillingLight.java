package com.example.command.furniture;

public class CeillingLight extends Light {
    public CeillingLight(){};

    public void on(){
        System.out.println("CeilingLight is on.");
    }
    public void off(){
        System.out.println("CeilingLight is off.");
    }

}
