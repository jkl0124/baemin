package com.example.demo.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    @JsonProperty("product_name")
    private String name;
    @JsonProperty("product_category")
    private int category;
    @JsonProperty("product_price")
    private int price;
    @JsonProperty("product_des")
    private String des;

    public Product toEntity(){
        return new Product(this.name,this.category,this.des,this.price);
    }
    public ProductDTO toDTO(Product product){
        this.name = product.getName();
        this.des = product.getDes();
        this.category = product.getCategory();
        this.price = product.getPrice();
        return this;
    }

    public ProductDTO(Product product){
        this.name = product.getName();
        this.des = product.getDes();
        this.category = product.getCategory();
        this.price = product.getPrice();
    }
}
