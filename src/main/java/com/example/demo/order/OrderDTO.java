package com.example.demo.order;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
    int productId;
    int count;

    public OrderDTO(int productId,int count) {
        this.productId = productId;
        this.count = count;
    }
}
