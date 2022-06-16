package com.ce.spring.sms.repository;

import com.ce.spring.sms.domain.entity.SectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "sectionRepository")
public interface SectionRepository extends JpaRepository<SectionEntity, Long> {
}
