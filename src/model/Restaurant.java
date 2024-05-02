package model;

import java.util.List;

public class Restaurant {
    String name;
    String cuisine_type;
    String location;
    boolean isActive;
    String openingHour;
    String closingHour;
    List<MenuItem> menus;

    public Restaurant(){}

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getOpeningHour() {
        return openingHour;
    }

    public void setOpeningHour(String openingHour) {
        this.openingHour = openingHour;
    }

    public String getClosingHour() {
        return closingHour;
    }

    public void setClosingHour(String closingHour) {
        this.closingHour = closingHour;
    }

    public String getCuisine_type() {
        return cuisine_type;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setCuisine_type(String cuisine_type) {
        this.cuisine_type = cuisine_type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Restaurant(String name, String cuisine_type, String location) {
        this.name = name;
        this.cuisine_type = cuisine_type;
        this.location = location;
    }
}
