package com.example.demo.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController {

    OrderService orderService;
    @Autowired
    OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @GetMapping("/test")
    public  String test(){
        return "test";
    }

    @PostMapping("/orders")
    public ResponseEntity<OrderDTO> orderProduct(@RequestBody OrderDTO orderDTO){
        System.out.println(orderDTO.productId);
        OrderDTO resultDTO = orderService.saveOrder(orderDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
