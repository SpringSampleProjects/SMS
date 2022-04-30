package com.ce.spring.sms.repository;

import com.ce.spring.sms.domain.entity.ParentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "parentRepository")
public interface ParentRepository extends JpaRepository<ParentEntity,Long> {
}
