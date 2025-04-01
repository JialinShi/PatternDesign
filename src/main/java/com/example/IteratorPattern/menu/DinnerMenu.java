package com.example.IteratorPattern.menu;

import java.util.Iterator;

public class DinnerMenu extends Menu{
    MenuItem[] menuItems;
    private static final int MAX_ITEMS = 6;
    int position = 0 ;


    public DinnerMenu(String name){
        super(name);
    }

//    public DinnerMenu(){
//        menuItems = new MenuItem[MAX_ITEMS];
//        addItem("BLT ", false, 2.99);
//        addItem("Beef and Cheese Sand ", false, 4.99);
//        addItem("Salad ", true, 3.49);
//    }
//
//    public void addItem(String name, boolean isVegetarian, double price){
//        MenuItem item = new MenuItem(name, isVegetarian,price);
//        if (position < MAX_ITEMS)
//            menuItems[position++] = item;
//        else {
//            System.out.println("Sorry, menu is full! Can't add item to menu.");
//        }
//    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
