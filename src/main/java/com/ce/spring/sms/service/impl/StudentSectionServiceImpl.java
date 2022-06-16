package com.ce.spring.sms.service.impl;

import com.ce.spring.sms.domain.entity.StudentSectionEntity;
import com.ce.spring.sms.domain.request.StudentSectionRequestModel;
import com.ce.spring.sms.repository.StudentSectionRepository;
import com.ce.spring.sms.service.StudentSectionService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "studentSectionService")
public class StudentSectionServiceImpl implements StudentSectionService {

    @Autowired
    private StudentSectionRepository studentSectionRepository;

    @Override
    public StudentSectionEntity addStudentSection(StudentSectionRequestModel studentSectionRequestModel) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        StudentSectionEntity studentSectionEntity = modelMapper.map(studentSectionRequestModel, StudentSectionEntity.class);

        return studentSectionRepository.save(studentSectionEntity);
    }

    @Override
    public StudentSectionEntity updateStudentSection(StudentSectionEntity studentSectionEntity) {
        return studentSectionRepository.save(studentSectionEntity);
    }

    @Override
    public void deleteStudentSection(Long studentSectionEntityId) {
        studentSectionRepository.deleteById(studentSectionEntityId);
    }

    @Override
    public Optional<StudentSectionEntity> getStudentSection(Long studentSectionEntityId) {
        return studentSectionRepository.findById(studentSectionEntityId);
    }

    @Override
    public List<StudentSectionEntity> getStudentSectionList() {
        return studentSectionRepository.findAll();
    }
}
