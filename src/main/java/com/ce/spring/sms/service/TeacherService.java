package com.ce.spring.sms.service;

import com.ce.spring.sms.domain.entity.TeacherEntity;
import com.ce.spring.sms.domain.shared.TeacherDto;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface TeacherService {

    TeacherEntity addTeacher(TeacherDto teacherDto);
    TeacherEntity updateTeacher(TeacherEntity teacherEntity);
    TeacherEntity updateTeacherEndingDate(Long teacherId, Date teacherEndingDate);
    void deleteTeacher(Long teacherId);
    Optional<TeacherEntity> getTeacher(Long teacherId);
    List<TeacherEntity> getTeachers();
}
