package com.sridhar.ecommerceApp;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Products> allProducts() {
        return productRepository.findAll();
    }

    public List<Products> findProduct(String searchTerm){
        return productRepository.findByKeywordContaining(searchTerm);
    }

    public List<Products>  singleProduct(String searchTerm){
        return productRepository.findByproductId(searchTerm);
    }
}
