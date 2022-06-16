package com.ce.spring.sms.controller;

import com.ce.spring.sms.domain.entity.StudentSectionEntity;
import com.ce.spring.sms.domain.request.StudentSectionRequestModel;
import com.ce.spring.sms.service.StudentSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "studentSectionController")
@RequestMapping(value = "/student/section")
public class StudentSectionController {

    @Autowired
    private StudentSectionService studentSectionService;

    @PostMapping(value = "/add")
    public StudentSectionEntity addStudentSection(@RequestBody StudentSectionRequestModel studentSectionRequestModel){
        return studentSectionService.addStudentSection(studentSectionRequestModel);
    }

    @PutMapping(value = "/update")
    public StudentSectionEntity updateStudentSection(@RequestBody StudentSectionEntity studentSectionEntity){
        return studentSectionService.updateStudentSection(studentSectionEntity);
    }

    @DeleteMapping(value = "/delete/{studentSectionId}")
    public void deleteStudentSection(@PathVariable Long studentSectionId){
        studentSectionService.deleteStudentSection(studentSectionId);
    }

    @GetMapping(value = "/get/{studentSectionId}")
    public StudentSectionEntity getStudentSection(@PathVariable Long studentSectionId){
        return studentSectionService.getStudentSection(studentSectionId).orElse(null);
    }

    @GetMapping(value = {"/","/gets"})
    public List<StudentSectionEntity> getStudentSectionList(){
        return studentSectionService.getStudentSectionList();
    }
}
