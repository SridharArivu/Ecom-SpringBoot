package com.sridhar.ecommerceApp.placeOrder;


import com.sridhar.ecommerceApp.Products;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends MongoRepository<OrderInput, ObjectId> {

    List<OrderInput> findByEmailContaining (String currentUser);
}
