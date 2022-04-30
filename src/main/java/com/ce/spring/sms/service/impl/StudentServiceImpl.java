package com.ce.spring.sms.service.impl;

import com.ce.spring.sms.domain.entity.StudentEntity;
import com.ce.spring.sms.domain.shared.StudentDto;
import com.ce.spring.sms.repository.StudentRepository;
import com.ce.spring.sms.service.StudentService;
import com.ce.spring.sms.utility.GeneratedSequenceNumber;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentEntity addStudent(StudentDto studentDto) {
        studentDto.setStudentRollNo(GeneratedSequenceNumber.getStudentSequenceNumber());

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        StudentEntity studentEntity = modelMapper.map(studentDto, StudentEntity.class);

        return studentRepository.save(studentEntity);
    }

    @Override
    public StudentEntity updateStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Optional<StudentEntity> getStudent(Long studentId) {
        return studentRepository.findById(studentId);
    }

    @Override
    public List<StudentEntity> getStudents() {
        return studentRepository.findAll();
    }

}
