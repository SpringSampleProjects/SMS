package com.ce.spring.sms.repository;

import com.ce.spring.sms.domain.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "studentRepository")
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
