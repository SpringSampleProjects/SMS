package com.ce.spring.sms.controller;

import com.ce.spring.sms.domain.entity.AddressEntity;
import com.ce.spring.sms.domain.request.AddressRequestModel;
import com.ce.spring.sms.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "addressController")
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping(value = "/add")
    public AddressEntity addAddress(@RequestBody AddressRequestModel addressRequestModel){
        return addressService.addAddress(addressRequestModel);
    }

    @PutMapping(value = "/update")
    public AddressEntity updateAddress(@RequestBody AddressEntity addressEntity){
        return addressService.updateAddress(addressEntity);
    }

    @DeleteMapping(value = "/delete/{addressId}")
    public void deleteAddress(@PathVariable Long addressId){
        addressService.deleteAddress(addressId);
    }

    @GetMapping(value = "/get/{addressId}")
    public AddressEntity getAddress(@PathVariable Long addressId){
        return addressService.getAddress(addressId).orElse(null);
    }

    @GetMapping(value = {"/","/gets"})
    public List<AddressEntity> getAddresses(){
        return addressService.getAddresses();
    }
}
