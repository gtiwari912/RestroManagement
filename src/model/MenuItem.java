package model;

public class MenuItem {
    String name;
    int price;
    String cuisine_type;

    public MenuItem(){}

    public MenuItem(String name, int price, String cuisine_type) {
        this.name = name;
        this.price = price;
        this.cuisine_type = cuisine_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCuisine_type() {
        return cuisine_type;
    }

    public void setCuisine_type(String cuisine_type) {
        this.cuisine_type = cuisine_type;
    }
}
