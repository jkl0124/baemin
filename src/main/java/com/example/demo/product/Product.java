package com.example.demo.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("product_id")
    private int id;
    @JsonProperty("product_name")
    private String name;
    @JsonProperty("product_category")
    private int category;
    @JsonProperty("product_price")
    private int price;
    @JsonProperty("product_des")
    private String des;

    public Product(String name, int price, String des,int category) {
        this.name = name;
        this.price = price;
        this.des = des;
        this.category = category;
    }

}
