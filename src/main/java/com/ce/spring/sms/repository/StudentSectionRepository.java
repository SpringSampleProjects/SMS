package com.ce.spring.sms.repository;

import com.ce.spring.sms.domain.entity.StudentSectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "studentSectionRepository")
public interface StudentSectionRepository extends JpaRepository<StudentSectionEntity, Long> {
}
