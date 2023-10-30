package com.sridhar.ecommerceApp.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressInput {

    private String firstName;
    private String lastName;
    private String doorStreetArea;
    private String city;
    private String state;
    private long pinCode;
    private long mobNumber;
    private long altMobNumber;

}
