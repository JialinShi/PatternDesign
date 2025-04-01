package com.example.IteratorPattern.menu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;

    public Menu(String name){
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    @Override
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }
    @Override
    public MenuComponent getChild(int i){
        return menuComponents.get(i);
    }
    // return menu name
    public String getName(){
        return name;
    }
    public void print(){
        System.out.println("This is " + name + " menu.");
        for(MenuComponent menuComponent: menuComponents){
            menuComponent.print();
        }
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    };



}
