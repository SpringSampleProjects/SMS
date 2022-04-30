package com.ce.spring.sms.service.impl;

import com.ce.spring.sms.domain.entity.TeacherCourseSectionEntity;
import com.ce.spring.sms.domain.request.TeacherCourseSectionRequestModel;
import com.ce.spring.sms.repository.TeacherCourseSectionRepository;
import com.ce.spring.sms.service.TeacherCourseSectionService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "teacherCourseSectionService")
public class TeacherCourseSectionServiceImpl implements TeacherCourseSectionService {

    @Autowired
    private TeacherCourseSectionRepository teacherCourseSectionRepository;

    @Override
    public TeacherCourseSectionEntity addTeacherCourseSection(TeacherCourseSectionRequestModel teacherCourseSectionRequestModel) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        TeacherCourseSectionEntity teacherCourseSectionEntity = modelMapper.map(teacherCourseSectionRequestModel, TeacherCourseSectionEntity.class);

        return teacherCourseSectionRepository.save(teacherCourseSectionEntity);
    }

    @Override
    public TeacherCourseSectionEntity updateTeacherCourseSection(TeacherCourseSectionEntity teacherCourseSectionEntity) {
        return teacherCourseSectionRepository.save(teacherCourseSectionEntity);
    }

    @Override
    public void deleteTeacherCourseSection(Long teacherCourseSectionId) {
        teacherCourseSectionRepository.deleteById(teacherCourseSectionId);
    }

    @Override
    public Optional<TeacherCourseSectionEntity> getTeacherCourseSection(Long teacherCourseSectionId) {
        return teacherCourseSectionRepository.findById(teacherCourseSectionId);
    }

    @Override
    public List<TeacherCourseSectionEntity> getTeacherCourseSectionList() {
        return teacherCourseSectionRepository.findAll();
    }
}
