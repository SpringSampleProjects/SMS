package com.ce.spring.sms.repository;

import com.ce.spring.sms.domain.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "addressRepository")
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}
