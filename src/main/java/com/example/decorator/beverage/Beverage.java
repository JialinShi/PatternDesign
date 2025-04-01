package com.example.decorator.beverage;

/**饮料基类*/
public abstract class Beverage {
    String description = "Unknown Beverage";
    public enum  Size  {TALL, GRANDE, VENTI};
    private Size size = Size.TALL;

    public String  getDescription(){
        return description + ", " + size;
    }
    public Size getSize(){
        return this.size;
    }
    public void setSize(Size size){
        this.size = size;
    }

    public abstract double cost();
}
