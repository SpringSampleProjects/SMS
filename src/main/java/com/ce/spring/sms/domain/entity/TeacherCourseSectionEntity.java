package com.ce.spring.sms.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Teacher_Course_Section",
        uniqueConstraints = @UniqueConstraint(columnNames = {"Teacher_Id","Course_Id","Section_Id"}))
@Data
@NoArgsConstructor
public class TeacherCourseSectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long teacherCourseSectionId;

    @ManyToOne
    @JoinColumn(name="Teacher_Id")
    private TeacherEntity teacherEntity;

    @ManyToOne
    @JoinColumn(name="Course_Id")
    private CourseEntity courseEntity;

    @ManyToOne
    @JoinColumn(name="Section_Id")
    private SectionEntity sectionEntity;

    public TeacherCourseSectionEntity(TeacherEntity teacherEntity, CourseEntity courseEntity, SectionEntity sectionEntity) {
        this.teacherEntity = teacherEntity;
        this.courseEntity = courseEntity;
        this.sectionEntity = sectionEntity;
    }
}
