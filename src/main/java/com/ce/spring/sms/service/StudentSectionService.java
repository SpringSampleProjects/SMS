package com.ce.spring.sms.service;

import com.ce.spring.sms.domain.entity.StudentSectionEntity;
import com.ce.spring.sms.domain.request.StudentSectionRequestModel;

import java.util.List;
import java.util.Optional;

public interface StudentSectionService {

    StudentSectionEntity addStudentSection(StudentSectionRequestModel sectionRequestModel);
    StudentSectionEntity updateStudentSection(StudentSectionEntity studentSectionEntity);
    void deleteStudentSection(Long studentSectionEntityId);
    Optional<StudentSectionEntity> getStudentSection(Long studentSectionEntityId);
    List<StudentSectionEntity> getStudentSectionList();
}
