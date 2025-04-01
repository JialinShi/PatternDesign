package com.example.IteratorPattern.menu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu extends Menu{
    Map<String, MenuItem> menuItems;


    public CafeMenu(String name){
        super(name);
    }


//    public CafeMenu(){
//        menuItems = new HashMap<String,MenuItem>();
//        addItem("burger", false, 3.99);
//        addItem("soup", true, 1.99);
//    }
//
//    public void addItem(String name, boolean isVegetarian, double price){
//        MenuItem item = new MenuItem(name, isVegetarian,price);
//        menuItems.put(name, item);
//    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
