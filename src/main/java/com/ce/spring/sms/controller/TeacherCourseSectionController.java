package com.ce.spring.sms.controller;

import com.ce.spring.sms.domain.entity.TeacherCourseSectionEntity;
import com.ce.spring.sms.domain.request.TeacherCourseSectionRequestModel;
import com.ce.spring.sms.service.TeacherCourseSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "teacherCourseSectionController")
@RequestMapping(value = "/teacher/course/section")
public class TeacherCourseSectionController {

    @Autowired
    private TeacherCourseSectionService teacherCourseSectionService;

    @PostMapping(value = "/add")
    public TeacherCourseSectionEntity addTeacherCourseSection(@RequestBody TeacherCourseSectionRequestModel teacherCourseSectionRequestModel){
        return teacherCourseSectionService.addTeacherCourseSection(teacherCourseSectionRequestModel);
    }

    @PutMapping(value = "/update")
    public TeacherCourseSectionEntity updateTeacherCourseSection(@RequestBody TeacherCourseSectionEntity teacherCourseSectionEntity){
        return teacherCourseSectionService.updateTeacherCourseSection(teacherCourseSectionEntity);
    }

    @DeleteMapping(value = "/delete/{teacherCourseSectionId}")
    public void deleteTeacherCourseSection(@PathVariable Long teacherCourseSectionId){
        teacherCourseSectionService.deleteTeacherCourseSection(teacherCourseSectionId);
    }

    @GetMapping(value = "/get/{teacherCourseSectionId}")
    public TeacherCourseSectionEntity getTeacherCourseSection(@PathVariable Long teacherCourseSectionId){
        return teacherCourseSectionService.getTeacherCourseSection(teacherCourseSectionId).orElse(null);
    }

    @GetMapping(value = {"/","/gets"})
    public List<TeacherCourseSectionEntity> getTeacherCourseSectionList(){
        return teacherCourseSectionService.getTeacherCourseSectionList();
    }
}
