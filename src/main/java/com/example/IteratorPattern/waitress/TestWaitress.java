package com.example.IteratorPattern.waitress;

import com.example.IteratorPattern.menu.CafeMenu;
import com.example.IteratorPattern.menu.DinnerMenu;
import com.example.IteratorPattern.menu.Menu;
import com.example.IteratorPattern.menu.MenuComponent;
import com.example.IteratorPattern.menu.MenuItem;
import com.example.IteratorPattern.menu.PancakeHouseMenu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestWaitress {

    public static void main(String[] args) {
//        Menu pancakeMenu = new PancakeHouseMenu();
//        Menu dinnerMenu = new DinnerMenu();
//        Menu cafeMenu = new CafeMenu();
//        List<Menu> menus = new ArrayList<>(Arrays.asList(pancakeMenu,dinnerMenu, cafeMenu));
//
//        Waitress waitress = new Waitress(menus);
//        waitress.printMenu();

        MenuComponent pancake_house=  new Menu("Pancake House");
        pancake_house.add(new MenuItem("K&B's Pancake", false, 2.99));
        pancake_house.add(new MenuItem("Blueberry Pancake", true, 3.49));
        pancake_house.add(new MenuItem("Chicken Waffle", false, 4.99));

        MenuComponent dinner_house =  new Menu("dinner");
        dinner_house.add(new MenuItem("Beef and Cheese Sand ", false, 4.99));

        MenuComponent cafe = new Menu("Cafe");
        cafe.add(new MenuItem("soup", true, 1.99));

        MenuComponent dessert_menu =  new Menu("dessert");
        dessert_menu.add(new MenuItem("icecream", true, 1.99));

        dinner_house.add(dessert_menu);

        MenuComponent allMenus = new Menu("All Manus");
        allMenus.add(pancake_house);
        allMenus.add(dinner_house);
        allMenus.add(cafe);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();







    }

}
