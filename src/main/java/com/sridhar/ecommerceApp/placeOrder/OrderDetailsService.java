package com.sridhar.ecommerceApp.placeOrder;


import com.sridhar.ecommerceApp.ProductService;
import com.sridhar.ecommerceApp.Products;
import com.sridhar.ecommerceApp.config.JwtAuthenticationFilter;
import com.sridhar.ecommerceApp.user.User;
import com.sridhar.ecommerceApp.user.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailsService {
    private static final String ORDER_PLACED = "Placed";
    @Autowired
    private OrderRepository orderRepository;


    @Autowired
    private ProductService  productService;

    @Autowired
    private UserRepository userRepository;
    public void placeOrder(OrderInput orderInput) throws Exception {

       List<OrderProductQuantity> productQuantityList = orderInput.getOrderProductQuantityList();

        OrderInput orderDetails = new OrderInput();

        for(OrderProductQuantity o: productQuantityList){
//           List<Products> products = productService.singleProduct(o.getProductId());
           String currentUser = JwtAuthenticationFilter.CURRENT_USER;
           User user =userRepository.findByEmail(currentUser).orElseThrow(null);



            orderDetails.setEmail(currentUser);
            orderDetails.setUsername(user.getUsername());
            orderDetails.setFullAddress(orderInput.getFullAddress());
            orderDetails.setAmount(orderInput.getAmount());
            orderDetails.setOrderProductQuantityList(productQuantityList);
       }

        orderRepository.save(orderDetails);

    }
}
