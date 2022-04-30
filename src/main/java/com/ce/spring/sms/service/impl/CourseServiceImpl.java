package com.ce.spring.sms.service.impl;

import com.ce.spring.sms.domain.entity.CourseEntity;
import com.ce.spring.sms.domain.shared.CourseDto;
import com.ce.spring.sms.repository.CourseRepository;
import com.ce.spring.sms.service.CourseService;
import com.ce.spring.sms.utility.GeneratedSequenceNumber;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "courseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public CourseEntity addCourse(CourseDto courseDto) {
        courseDto.setCourseRollNumber(GeneratedSequenceNumber.getCourseSequenceNumber(courseDto.getCourseName().substring(0,3).toUpperCase()));
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        CourseEntity courseEntity = modelMapper.map(courseDto, CourseEntity.class);

        return courseRepository.save(courseEntity);
    }

    @Override
    public CourseEntity updateCourse(CourseEntity courseEntity) {
        return courseRepository.save(courseEntity);
    }

    @Override
    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }

    @Override
    public Optional<CourseEntity> getCourse(Long courseId) {
        return courseRepository.findById(courseId);
    }

    @Override
    public List<CourseEntity> getCourses() {
        return courseRepository.findAll();
    }
}
