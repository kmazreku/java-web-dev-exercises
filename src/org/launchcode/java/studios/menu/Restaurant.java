package org.launchcode.java.studios.menu;

import java.util.ArrayList;
import java.time.LocalDate;



public class Restaurant {
    public static void main (String[] args){

        MenuItem menuItem = new MenuItem(10, "Salsa", "appetizer", true, LocalDate.now());
        MenuItem menuItem1 = new MenuItem(12, "Salad", "appetizer", true, LocalDate.now());
        MenuItem menuItem2 = new MenuItem(17, "Burger", "appetizer", true, LocalDate.now());
        LocalDate today = LocalDate.now();
        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, startingMenu);
        ourMenu.addItem(menuItem);
        ourMenu.addItem(menuItem1);
        ourMenu.addItem(menuItem2);
        System.out.println(ourMenu.toString());


        ourMenu.removeItem(menuItem2);
        System.out.println(ourMenu);


    }
}
