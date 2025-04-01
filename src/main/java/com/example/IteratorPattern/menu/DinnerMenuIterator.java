package com.example.IteratorPattern.menu;
import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem>{
    MenuItem[] menuItems;
    int position;

    public DinnerMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        if(position >= menuItems.length || menuItems[position] == null){
            return null;
        }else{
            MenuItem item = menuItems[position];
            position++;
            return item;
        }

    }
}
