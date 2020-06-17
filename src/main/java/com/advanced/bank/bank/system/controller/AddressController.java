package com.advanced.bank.bank.system.controller;

import com.advanced.bank.bank.system.model.Address;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AddressController {

    @PostMapping
    void createAddress(@RequestBody Address address){

    }

    @PutMapping
    void updateAddress(@RequestBody Address address){

    }

    @GetMapping
    List<Address> getAllAddresses(){
        return null;
    }

    @GetMapping("/{addressId}")
    public Address getAddress(@PathVariable Long addressId){
        return null;
    }

    @DeleteMapping("/{addressId}")
    public void deleteAddress(@PathVariable("addressId") Long addressId)
    {

    }
}
