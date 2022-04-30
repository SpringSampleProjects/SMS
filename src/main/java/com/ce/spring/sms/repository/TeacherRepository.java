package com.ce.spring.sms.repository;

import com.ce.spring.sms.domain.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "teacherRepository")
public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {
}
