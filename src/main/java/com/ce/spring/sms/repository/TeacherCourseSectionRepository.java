package com.ce.spring.sms.repository;

import com.ce.spring.sms.domain.entity.TeacherCourseSectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "teacherCourseSectionRepository")
public interface TeacherCourseSectionRepository extends JpaRepository<TeacherCourseSectionEntity, Long> {
}
