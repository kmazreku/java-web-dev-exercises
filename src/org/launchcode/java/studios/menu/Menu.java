package org.launchcode.java.studios.menu;

import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;

public class Menu {
    private ArrayList<MenuItem> items;
    private LocalDate updatedDt;



    public LocalDate getUpdatedDt(){
        return updatedDt;
    }

    public void setUpdatedDt(LocalDate updatedDt){
        this.updatedDt= updatedDt;
    }
    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.items.add(item);
        return this.items;
    }

    public void removeItem(MenuItem item) {
       this.items.remove(item);
    }

    @Override
    public String toString() {
        return "Menu:" +
                items.toString() +"\n"+
                "\n"+ "updatedDt=" + updatedDt;
    }

    public Menu (LocalDate updateDt, ArrayList<MenuItem> item){
        this.updatedDt=updateDt;
        this.items=item;
    }

}
