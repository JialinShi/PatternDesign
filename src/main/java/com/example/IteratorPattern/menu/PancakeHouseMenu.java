package com.example.IteratorPattern.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu extends Menu {

    List<MenuItem> menuItems;


    public PancakeHouseMenu(String name) {
        super(name);
    }

//    public PancakeHouseMenu(String name){
//        menuItems = new ArrayList<>();
//        addItem("K&B's Pancake", false, 2.99);
//        addItem("Blueberry Pancake", true, 3.49);
//        addItem("Chicken Waffle", false, 4.99);
//
//    }
//    public void addItem(String name, boolean isVegetarian, double price){
//        MenuItem item = new MenuItem(name, isVegetarian,price);
//        menuItems.add(item);
//    }


    @Override
    public Iterator createIterator() {
        return  menuItems.iterator();
    }


}
