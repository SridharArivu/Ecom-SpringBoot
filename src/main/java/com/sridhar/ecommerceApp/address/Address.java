package com.sridhar.ecommerceApp.address;

import com.sridhar.ecommerceApp.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    private String doorStreetArea;
    private String city;
    private String state;
    private long pinCode;
    private long mobNumber;
    private long altMobNumber;
    private String email;
}
