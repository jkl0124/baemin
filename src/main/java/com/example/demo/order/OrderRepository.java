package com.example.demo.order;

import com.example.demo.product.Product;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    Map<Integer,Order> orderDTOMap = new HashMap<>();
private int id = 0;
    Order saveOrder(Order order){
        order.setId(id++);
        orderDTOMap.put(id,order);
        return order;
    }
}
