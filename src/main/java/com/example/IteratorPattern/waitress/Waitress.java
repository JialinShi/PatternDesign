package com.example.IteratorPattern.waitress;
import com.example.IteratorPattern.menu.*;
import java.util.Iterator;
import java.util.List;

public class Waitress {
    MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent){
        this.menuComponent = menuComponent;
    }

    public void printMenu(){
        menuComponent.print();

    }


}
