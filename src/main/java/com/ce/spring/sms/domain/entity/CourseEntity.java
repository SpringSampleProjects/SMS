package com.ce.spring.sms.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Course")
@Data
@NoArgsConstructor
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long courseId;

    @Column(name="Name", nullable = false)
    private String courseName;

    @Column(name="Roll_No", unique = true, nullable = false)
    private String courseRollNumber;


    public CourseEntity(String courseName, String courseRollNumber){
        this.courseName = courseName;
        this.courseRollNumber = courseRollNumber;
    }
}
