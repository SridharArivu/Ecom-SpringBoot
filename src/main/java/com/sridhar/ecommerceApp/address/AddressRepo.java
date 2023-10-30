package com.sridhar.ecommerceApp.address;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepo extends MongoRepository<Address,ObjectId> {

    List<Optional<Address>> findByEmailContaining (String email);
}
