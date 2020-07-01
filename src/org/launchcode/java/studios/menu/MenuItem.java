package org.launchcode.java.studios.menu;
import java.time.LocalDate;
import java.util.Objects;


public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew =false;
    private LocalDate date;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String decription){
        this.description = decription;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory( String category){
        this.category= category;
    }

    public boolean getIsNew (){
        return isNew;
    }

    public void setIsNew (boolean isNew){
        this.isNew =isNew;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date){
        this.date=date;
    }

    @Override
    public String toString() {
        return "Item:" +
                "price=" + price +
                "\n"+"description: " + description+
                "\n"+"category: " + category+
                "\n"+"Is New:" + isNew +
                "\n"+"date:" + date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 &&
                Objects.equals(description, menuItem.description) &&
                Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category);
    }

    public MenuItem (double price, String description, String category, boolean isNew, LocalDate date){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.date=date;
    }
}
