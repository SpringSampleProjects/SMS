package com.ce.spring.sms.service;

import com.ce.spring.sms.domain.entity.TeacherCourseSectionEntity;
import com.ce.spring.sms.domain.request.TeacherCourseSectionRequestModel;

import java.util.List;
import java.util.Optional;

public interface TeacherCourseSectionService {

    TeacherCourseSectionEntity addTeacherCourseSection(TeacherCourseSectionRequestModel teacherCourseSectionRequestModel);
    TeacherCourseSectionEntity updateTeacherCourseSection(TeacherCourseSectionEntity teacherCourseSectionEntity);
    void deleteTeacherCourseSection(Long teacherCourseSectionId);
    Optional<TeacherCourseSectionEntity> getTeacherCourseSection(Long teacherCourseSectionId);
    List<TeacherCourseSectionEntity> getTeacherCourseSectionList();
}
