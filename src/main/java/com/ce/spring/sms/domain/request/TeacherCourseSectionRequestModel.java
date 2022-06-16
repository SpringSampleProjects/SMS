package com.ce.spring.sms.domain.request;

import com.ce.spring.sms.domain.entity.CourseEntity;
import com.ce.spring.sms.domain.entity.SectionEntity;
import com.ce.spring.sms.domain.entity.TeacherEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherCourseSectionRequestModel {

    private TeacherEntity teacherEntity;
    private CourseEntity courseEntity;
    private SectionEntity sectionEntity;
}
