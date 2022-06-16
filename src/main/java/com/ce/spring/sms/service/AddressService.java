package com.ce.spring.sms.service;

import com.ce.spring.sms.domain.entity.AddressEntity;
import com.ce.spring.sms.domain.request.AddressRequestModel;

import java.util.List;
import java.util.Optional;

public interface AddressService {

    AddressEntity addAddress(AddressRequestModel addressRequestModel);
    AddressEntity updateAddress(AddressEntity addressEntity);
    void deleteAddress(Long addressId);
    Optional<AddressEntity> getAddress(Long addressId);
    List<AddressEntity> getAddresses();
}
