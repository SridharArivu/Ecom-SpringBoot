package com.sridhar.ecommerceApp.placeOrder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000/**")
public class OrderDetailController {

    @Autowired
    private OrderDetailsService orderDetailsService;

    @PostMapping("/placeOrder")
    public void placeOrder(@RequestBody OrderInput orderInput ) throws Exception {
        orderDetailsService.placeOrder(orderInput);
    }
}
