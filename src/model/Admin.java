package model;

import repository.RestaurantRepository;

public class Admin {
    String name;
    String userName;
    String password;
    RestaurantRepository allRestraunts = new RestaurantRepository();
}