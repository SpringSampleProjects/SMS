package com.ce.spring.sms.controller;

import com.ce.spring.sms.domain.entity.CourseEntity;
import com.ce.spring.sms.domain.request.CourseRequestModel;
import com.ce.spring.sms.domain.shared.CourseDto;
import com.ce.spring.sms.service.CourseService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "courseController")
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping(value="/add")
    public CourseEntity addCourse(@RequestBody CourseRequestModel courseRequestModel){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        CourseDto courseDto = modelMapper.map(courseRequestModel, CourseDto.class);

        return courseService.addCourse(courseDto);
    }

    @PutMapping(value="/update")
    public CourseEntity updateCourse(@RequestBody CourseEntity courseEntity){
        return courseService.updateCourse(courseEntity);
    }

    @DeleteMapping(value="/delete/{courseId}")
    public void deleteCourse(@PathVariable Long courseId){
        courseService.deleteCourse(courseId);
    }

    @GetMapping(value = "/get/{courseId}")
    public CourseEntity getCourse(@PathVariable Long courseId){
        return courseService.getCourse(courseId).orElse(null);
    }

    @GetMapping(value = {"/","/gets"})
    public List<CourseEntity> getCourses(){
        return courseService.getCourses();
    }
}
