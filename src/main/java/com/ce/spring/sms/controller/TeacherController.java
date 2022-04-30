package com.ce.spring.sms.controller;

import com.ce.spring.sms.domain.entity.TeacherEntity;
import com.ce.spring.sms.domain.request.TeacherRequestModel;
import com.ce.spring.sms.domain.shared.TeacherDto;
import com.ce.spring.sms.service.TeacherService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController(value = "teacherController")
@RequestMapping(value = "/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping(value = "/add")
    public TeacherEntity addTeacher(@RequestBody TeacherRequestModel teacherRequestModel){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        TeacherDto teacherDto = modelMapper.map(teacherRequestModel, TeacherDto.class);

        return teacherService.addTeacher(teacherDto);
    }

    @PutMapping(value = "/update")
    public TeacherEntity updateTeacher(@RequestBody TeacherEntity teacherEntity){
        return teacherService.updateTeacher(teacherEntity);
    }

    @GetMapping(value = "/update/endingDate/{teacherId}/{endingDate}")
    public TeacherEntity updateTeacherEndingDate(@PathVariable Long teacherId, @PathVariable String endingDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd", Locale.ENGLISH);
        Date newEndingDate = formatter.parse(endingDate);
        return teacherService.updateTeacherEndingDate(teacherId,newEndingDate);
    }

    @DeleteMapping(value = "/delete/{teacherId}")
    public void deleteTeacher(@PathVariable Long teacherId){
        teacherService.deleteTeacher(teacherId);
    }

    @GetMapping(value = "/get/{teacherId}")
    public TeacherEntity getTeacher(@PathVariable Long teacherId){
        return teacherService.getTeacher(teacherId).orElse(null);
    }

    @GetMapping(value = {"/","/gets"})
    public List<TeacherEntity> getTeachers(){
        return teacherService.getTeachers();
    }
}
