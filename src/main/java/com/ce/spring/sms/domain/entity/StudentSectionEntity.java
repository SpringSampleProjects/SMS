package com.ce.spring.sms.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Student_Section",
        uniqueConstraints = @UniqueConstraint(columnNames = {"Student_Id","Section_Id","Year"}))
@Data
@NoArgsConstructor
public class StudentSectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long studentSectionId;

    @ManyToOne
    @JoinColumn(name="Student_Id")
    private StudentEntity studentEntity;

    @ManyToOne
    @JoinColumn(name="Section_Id")
    private SectionEntity sectionEntity;

    @Column(name = "Register_Date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date registerDate;

    @Column(name = "Year", nullable = false)
    private Integer year;

    public StudentSectionEntity(StudentEntity studentEntity, SectionEntity sectionEntity, Date registerDate, Integer year) {
        this.studentEntity = studentEntity;
        this.sectionEntity = sectionEntity;
        this.registerDate = registerDate;
        this.year = year;
    }
}
