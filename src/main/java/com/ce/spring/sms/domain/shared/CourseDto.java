package com.ce.spring.sms.domain.shared;

import com.ce.spring.sms.domain.entity.SectionEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {

    private String courseName;
    private String courseRollNumber;
}
