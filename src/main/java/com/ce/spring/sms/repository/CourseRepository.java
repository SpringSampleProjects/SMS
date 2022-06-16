package com.ce.spring.sms.repository;

import com.ce.spring.sms.domain.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "courseRepository")
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
}
