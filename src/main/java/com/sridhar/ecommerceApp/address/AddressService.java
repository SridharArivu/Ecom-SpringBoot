package com.sridhar.ecommerceApp.address;

import com.sridhar.ecommerceApp.config.JwtAuthenticationFilter;
import com.sridhar.ecommerceApp.user.User;
import com.sridhar.ecommerceApp.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    private final UserRepository userRepository;
    private final AddressRepo addressRepository;
    @Autowired
    public AddressService(UserRepository userRepository, AddressRepo addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }

public List<Optional<Address>> findAddress() throws Exception{

    String currentUser = JwtAuthenticationFilter.CURRENT_USER;

    return addressRepository.findByEmailContaining(currentUser);
}
public void createAddress(Address address) throws Exception {

        String currentUser = JwtAuthenticationFilter.CURRENT_USER;

        User user =userRepository.findByEmail(currentUser).orElseThrow(null);

        Address newAddress = new Address();

        newAddress.setFirstName(address.getFirstName());
        newAddress.setLastName(address.getLastName());
        newAddress.setDoorStreetArea(address.getDoorStreetArea());
        newAddress.setCity(address.getCity());
        newAddress.setState(address.getState());
        newAddress.setPinCode(address.getPinCode());
        newAddress.setMobNumber(address.getMobNumber());
        newAddress.setAltMobNumber(address.getAltMobNumber());
        newAddress.setEmail(user.getEmail());

        addressRepository.save(newAddress);
    }
}
