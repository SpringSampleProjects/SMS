package com.ce.spring.sms.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;

@Entity
@Table(name="Teacher")
@Data
@NoArgsConstructor
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long teacherId;

    @Column(name = "First_Name", nullable = false)
    private String teacherFirstName;

    @Column(name = "Middle_Name")
    private String teacherMiddleName;

    @Column(name = "Last_Name", nullable = false)
    private String teacherLastName;

    @Column(name = "Roll_Num", nullable = false, unique = true)
    private String teacherRollNo;

    @Column(name = "Age", nullable = false)
    private int teacherAge;

    @Temporal(TemporalType.DATE)
    @Column(name = "Starting_Date", nullable = false)
    private Date teacherStartingDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "Ending_Date")
    private Date teacherEndingDate;

    @Column(name = "SSN", nullable = false, unique = true, length = 10)
    private String teacherSSN;

    @Column(name = "Phone_Number", nullable = false, unique = true, length = 13)
    private String teacherPhoneNum;

    @Email
    @Column(name = "Email", nullable = false, unique = true)
    private String teacherEmail;

    @OneToOne
    @JoinColumn(name="Address_Id")
    private AddressEntity addressEntity;

    public TeacherEntity(String teacherFirstName, String teacherMiddleName, String teacherLastName, String teacherRollNo, int teacherAge, Date teacherStartingDate, String teacherSSN, String teacherPhoneNum, String teacherEmail, AddressEntity addressEntity) {
        this.teacherFirstName = teacherFirstName;
        this.teacherMiddleName = teacherMiddleName;
        this.teacherLastName = teacherLastName;
        this.teacherRollNo = teacherRollNo;
        this.teacherAge = teacherAge;
        this.teacherStartingDate = teacherStartingDate;
        this.teacherSSN = teacherSSN;
        this.teacherPhoneNum = teacherPhoneNum;
        this.teacherEmail = teacherEmail;
        this.addressEntity = addressEntity;
    }
}
