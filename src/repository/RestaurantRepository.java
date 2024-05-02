package repository;

import model.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RestaurantRepository {
    HashMap<String, List<Restaurant>> map = new HashMap<>();

    public void addRestaurnat(Restaurant rest){
        String type = rest.getCuisine_type();
        map.get(type).add(rest);
    }

    public void removeRestraunt(Restaurant rest){
        String type = rest.getCuisine_type();
        map.get(type).remove(rest);
    }

}
