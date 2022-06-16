package com.ce.spring.sms.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="Section")
public class SectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long sectionId;

    @Column(name = "Name", nullable = false, unique = true)
    private String sectionName;

    public SectionEntity(String sectionName){
        this.sectionName = sectionName;
    }
}
