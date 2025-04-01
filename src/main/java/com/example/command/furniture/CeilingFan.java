package com.example.command.furniture;

public class CeilingFan {
    public enum Speed{
        OFF(0), LOW(1), MEDIUM(2), HIGH(3);
        private int value;
        private Speed(int val){
            value = val;
        }
        public int getValue(){
            return value;
        }
    }
    private Speed speed;
    public CeilingFan(){
        speed = Speed.OFF;
    }


    public void high(){
        speed = speed.HIGH;
        System.out.println("speed is now High " + speed.getValue());
    }
    public void low(){
        speed = speed.LOW;
    }
    public void off(){
        speed = speed.OFF;
        System.out.println("speed is now off "+ speed.getValue());
    }
    public void medium(){
        speed = speed.MEDIUM;
        System.out.println("speed is now medium "+ speed.getValue());
    }
    public Speed getSpeed(){
        return speed;
    }






}
