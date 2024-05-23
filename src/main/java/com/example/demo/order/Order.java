package com.example.demo.order;

import com.example.demo.product.Product;
import lombok.Getter;
import lombok.Setter;
@Getter
public class Order {
    @Setter
    int id;
    Product product;
    int count;

    public Order(Product product, int count) {
        this.product = product;
        this.count = count;
    }

}
