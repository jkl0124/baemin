package com.example.demo.food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class FoodReposity {
    Map<Integer,Food> db = new HashMap<Integer,Food>();

    public Food getFood(int key){
        return db.get(key);
    }

    public ArrayList<Food> getFoodsByRestaurant(int resId){
        return null;
    }
}
