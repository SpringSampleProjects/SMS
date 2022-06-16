package com.ce.spring.sms.domain.request;

import com.ce.spring.sms.domain.entity.AddressEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherRequestModel {

    private String teacherFirstName;
    private String teacherMiddleName;
    private String teacherLastName;
    private int teacherAge;
    private Date teacherStartingDate;
    private String teacherSSN;
    private String teacherPhoneNum;
    private String teacherEmail;
    private AddressEntity addressEntity;
}
