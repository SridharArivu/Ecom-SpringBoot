package com.sridhar.ecommerceApp.placeOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderProductQuantity {

    private String productName;
    private String productImage;
    private Integer quantity;
}
