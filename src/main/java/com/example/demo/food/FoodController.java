package com.example.demo.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    FoodService foodService;
    @Autowired
    FoodController(FoodService foodService){
        this.foodService = foodService;
    }
    @GetMapping("/foods/{id}")
    public Food findFood(@PathVariable int id){
        return foodService.getFood(id);
    }
}
