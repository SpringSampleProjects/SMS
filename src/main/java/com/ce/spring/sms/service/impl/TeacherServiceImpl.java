package com.ce.spring.sms.service.impl;

import com.ce.spring.sms.domain.entity.TeacherEntity;
import com.ce.spring.sms.domain.shared.TeacherDto;
import com.ce.spring.sms.repository.TeacherRepository;
import com.ce.spring.sms.service.TeacherService;
import com.ce.spring.sms.utility.GeneratedSequenceNumber;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service(value = "teacherService")
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public TeacherEntity addTeacher(TeacherDto teacherDto) {
        teacherDto.setTeacherRollNo(GeneratedSequenceNumber.getTeacherSequenceNumber());
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        TeacherEntity teacherEntity = modelMapper.map(teacherDto, TeacherEntity.class);

        return teacherRepository.save(teacherEntity);
    }

    @Override
    public TeacherEntity updateTeacher(TeacherEntity teacherEntity) {
        return teacherRepository.save(teacherEntity);
    }

    @Override
    public TeacherEntity updateTeacherEndingDate(Long teacherId, Date teacherEndingDate) {
        TeacherEntity teacherEntity = getTeacher(teacherId).orElse(null);
        teacherEntity.setTeacherEndingDate(teacherEndingDate);
        return teacherRepository.save(teacherEntity);
    }

    @Override
    public void deleteTeacher(Long teacherId) {
        teacherRepository.deleteById(teacherId);
    }

    @Override
    public Optional<TeacherEntity> getTeacher(Long teacherId) {
        return teacherRepository.findById(teacherId);
    }

    @Override
    public List<TeacherEntity> getTeachers() {
        return teacherRepository.findAll();
    }
}
