package com.example.demo.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    FoodReposity foodReposity;
    @Autowired
    FoodService(FoodReposity foodReposity){
        this.foodReposity = foodReposity;
    }

    public Food getFood(int key){
        return foodReposity.getFood(key);
    }
}
