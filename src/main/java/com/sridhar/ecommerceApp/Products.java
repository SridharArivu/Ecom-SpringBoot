package com.sridhar.ecommerceApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    @Id
    private ObjectId id;
    private String name;
    private String image;
    private Integer price;
    private String productId;
    private String keyword;


}
