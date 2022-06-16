package com.ce.spring.sms.controller;

import com.ce.spring.sms.domain.entity.StudentEntity;
import com.ce.spring.sms.domain.request.StudentRequestModel;
import com.ce.spring.sms.domain.shared.StudentDto;
import com.ce.spring.sms.service.StudentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "studentController")
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/add")
    public StudentEntity saveStudent(@RequestBody StudentRequestModel studentRequestModel){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        StudentDto studentDto = modelMapper.map(studentRequestModel, StudentDto.class);

        return studentService.addStudent(studentDto);
    }

    @PutMapping(value = "/update")
    public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity){
        return studentService.updateStudent(studentEntity);
    }

    @DeleteMapping(value = "/delete/{studentId}")
    public void deleteStudent(@PathVariable Long studentId){
        studentService.deleteStudent(studentId);
    }

    @GetMapping(value = "/get/{studentId}")
    public StudentEntity getStudent(@PathVariable Long studentId){
        return studentService.getStudent(studentId).orElse(null);
    }

    @GetMapping(value = {"/", "/gets"})
    public List<StudentEntity> getStudents(){
        return studentService.getStudents();
    }

}
