package com.sridhar.ecommerceApp.accountDetails;

import com.sridhar.ecommerceApp.address.Address;
import com.sridhar.ecommerceApp.placeOrder.OrderInput;
import com.sridhar.ecommerceApp.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetails {
    private User user;
    private OrderInput orderInput;
    private Address address;
}
