package com.sridhar.ecommerceApp.accountDetails;

import com.sridhar.ecommerceApp.address.Address;
import com.sridhar.ecommerceApp.address.AddressRepo;
import com.sridhar.ecommerceApp.config.JwtAuthenticationFilter;
import com.sridhar.ecommerceApp.placeOrder.OrderInput;
import com.sridhar.ecommerceApp.placeOrder.OrderRepository;
import com.sridhar.ecommerceApp.user.User;
import com.sridhar.ecommerceApp.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceAccountDetails {
    @Autowired
    private AddressRepo addressRepo;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;


    public List<Optional<Address>> getAddress() {

        String CurrentUser = JwtAuthenticationFilter.CURRENT_USER;

        return addressRepo.findByEmailContaining(CurrentUser);

    }

    public List<OrderInput> getOrderDetails() {

        String CurrentUser = JwtAuthenticationFilter.CURRENT_USER;

        return orderRepository.findByEmailContaining(CurrentUser);
    }

    public Optional<User> userDetails() {
        String CurrentUser = JwtAuthenticationFilter.CURRENT_USER;

        return userRepository.findByEmail(CurrentUser);

    }
}
