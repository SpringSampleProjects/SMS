package com.ce.spring.sms.domain.request;

import com.ce.spring.sms.domain.entity.SectionEntity;
import com.ce.spring.sms.domain.entity.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentSectionRequestModel {

    private StudentEntity studentEntity;
    private SectionEntity sectionEntity;
    private Date registerDate;
    private Integer year;
}
