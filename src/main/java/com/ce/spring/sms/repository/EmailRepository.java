package com.ce.spring.sms.repository;

import com.ce.spring.sms.domain.entity.EmailEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "emailRepository")
public interface EmailRepository extends MongoRepository<EmailEntity, String> {
}
