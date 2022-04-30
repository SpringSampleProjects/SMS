package com.ce.spring.sms.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Student")
@Data
@NoArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long studentId;

    @Column(name="First_Name", nullable = false)
    private String studentFirstName;

    @Column(name="Middle_Name")
    private String studentMiddleName;

    @Column(name="Last_Name", nullable = false)
    private String studentLastName;

    @Column(name="Age", nullable = false)
    private Integer studentAge;

    @Column(name="Roll_No", unique = true, nullable = false)
    private String studentRollNo;

    @ManyToOne
    @JoinColumn(name="Parent_Id")
    private ParentEntity parentEntity;

    public StudentEntity(String studentFirstName, String studentMiddleName, String studentLastName, Integer studentAge, String studentRollNo, ParentEntity parentEntity){
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = studentMiddleName;
        this.studentLastName = studentLastName;
        this.studentAge = studentAge;
        this.studentRollNo = studentRollNo;
        this.parentEntity = parentEntity;
    }
}
