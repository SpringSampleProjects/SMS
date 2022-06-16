package com.ce.spring.sms.service;

import com.ce.spring.sms.domain.entity.StudentEntity;
import com.ce.spring.sms.domain.shared.StudentDto;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    StudentEntity addStudent(StudentDto studentDto);
    StudentEntity updateStudent(StudentEntity studentEntity);
    void deleteStudent(Long studentId);
    Optional<StudentEntity> getStudent(Long studentId);
    List<StudentEntity> getStudents();
}
