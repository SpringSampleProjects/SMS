package com.ce.spring.sms.service;

import com.ce.spring.sms.domain.entity.CourseEntity;
import com.ce.spring.sms.domain.shared.CourseDto;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    CourseEntity addCourse(CourseDto courseDto);
    CourseEntity updateCourse(CourseEntity courseEntity);
    void deleteCourse(Long courseId);
    Optional<CourseEntity> getCourse(Long courseId);
    List<CourseEntity> getCourses();
}
