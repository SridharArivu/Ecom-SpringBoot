package com.sridhar.ecommerceApp;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Products, ObjectId>{


    List<Products> findByKeywordContaining(String searchTerm);

    List<Products> findByproductId(String Keyword);
}
