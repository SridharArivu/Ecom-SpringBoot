package com.sridhar.ecommerceApp.address;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    private final AddressService addressService;
    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/save-address")
    public void SaveAddress (@RequestBody Address address) throws Exception{
        addressService.createAddress(address);
    }

    @GetMapping("/get-address")
    public List<Optional<Address>> Address () throws Exception{

        return addressService.findAddress();
    }
}
