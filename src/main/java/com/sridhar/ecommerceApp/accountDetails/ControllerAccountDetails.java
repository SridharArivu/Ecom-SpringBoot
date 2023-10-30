package com.sridhar.ecommerceApp.accountDetails;

import com.sridhar.ecommerceApp.address.Address;
import com.sridhar.ecommerceApp.config.JwtAuthenticationFilter;
import com.sridhar.ecommerceApp.placeOrder.OrderInput;
import com.sridhar.ecommerceApp.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account-details")
public class ControllerAccountDetails {
    @Autowired
    public ServiceAccountDetails service;

    @GetMapping("/address")
    public ResponseEntity<List<Optional<Address>>> Address () throws Exception {
        return ResponseEntity.ok(service.getAddress());
    }

    @GetMapping("/order-details")
    public ResponseEntity<List<OrderInput>> orderDetails () throws Exception {
        return ResponseEntity.ok(service.getOrderDetails());
    }

    @GetMapping("/user-details")
    public ResponseEntity<Optional<User>> userDetails () throws Exception {
        return ResponseEntity.ok(service.userDetails());
    }
}
