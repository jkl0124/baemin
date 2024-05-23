package com.example.demo.order;

import com.example.demo.product.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    OrderRepository orderRepository;
    ProductRepository productRepository;
    OrderService(OrderRepository orderRepository,ProductRepository productRepository){
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    OrderDTO saveOrder(OrderDTO orderDTO){
        Order order = new Order(this.productRepository.findProductById(orderDTO.getProductId()),orderDTO.getCount());
        order = this.orderRepository.saveOrder(order);
        return new OrderDTO(order.getProduct().getId(), order.getId());
    }
}
