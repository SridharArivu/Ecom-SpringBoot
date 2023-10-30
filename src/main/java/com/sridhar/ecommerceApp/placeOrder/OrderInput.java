package com.sridhar.ecommerceApp.placeOrder;

import com.sridhar.ecommerceApp.RazorPay.Amount;
import com.sridhar.ecommerceApp.address.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "orderDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInput {
    private ObjectId id;
    private String email;
    private String username;
    private Address fullAddress;
    private int amount;
    private List<OrderProductQuantity> orderProductQuantityList;


}
