package com.ce.spring.sms.service.impl;

import com.ce.spring.sms.domain.entity.AddressEntity;
import com.ce.spring.sms.domain.request.AddressRequestModel;
import com.ce.spring.sms.repository.AddressRepository;
import com.ce.spring.sms.service.AddressService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "addressService")
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public AddressEntity addAddress(AddressRequestModel addressRequestModel) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AddressEntity addressEntity = modelMapper.map(addressRequestModel, AddressEntity.class);

        return addressRepository.save(addressEntity);
    }

    @Override
    public AddressEntity updateAddress(AddressEntity addressEntity) {
        return addressRepository.save(addressEntity);
    }

    @Override
    public void deleteAddress(Long addressId) {
        addressRepository.deleteById(addressId);
    }

    @Override
    public Optional<AddressEntity> getAddress(Long addressId) {
        return addressRepository.findById(addressId);
    }

    @Override
    public List<AddressEntity> getAddresses() {
        return addressRepository.findAll();
    }
}
