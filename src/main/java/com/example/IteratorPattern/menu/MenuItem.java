package com.example.IteratorPattern.menu;

public class MenuItem extends MenuComponent{
    String name;
    boolean vegetarian;
    double price;

    public MenuItem(String name, boolean  vegetarian, double price){
        this.name = name;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        String vegetarian = "";
        if(isVegetarian()){
            vegetarian = "vegetarian, ";
        }
        return name + ", "+ vegetarian+ price;
    }
    public void print(){
        System.out.println(this);
    }

}
