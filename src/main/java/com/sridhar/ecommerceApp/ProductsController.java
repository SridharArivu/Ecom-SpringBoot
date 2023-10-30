package com.sridhar.ecommerceApp;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")

public class ProductsController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Products>> getAllProducts(){
        return new ResponseEntity<List<Products>>(productService.allProducts(), HttpStatus.OK) ;
    }
    @GetMapping("/search")
    public ResponseEntity<List<Products>> searchProduct(@RequestParam String searchTerm){
        return new ResponseEntity<List<Products>>(productService.findProduct(searchTerm), HttpStatus.OK) ;
    }
}
