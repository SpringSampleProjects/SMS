package com.ce.spring.sms.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Parent")
@Data
@NoArgsConstructor
public class ParentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long parentId;

    @NotNull
    @Column(name="First_Name", nullable = false)
    private String parentFirstName;

    @Column(name="Middle_Name")
    private String parentMiddleName;

    @NotNull
    @Column(name="Last_Name", nullable = false)
    private String parentLastName;

    @NotNull
    @Column(name = "SSN", unique = true, length = 10, nullable = false)
    private String parentSSN;

    @NotNull
    @ManyToOne
    @JoinColumn(name="Address_Id")
    private AddressEntity addressEntity;

    @NotNull
    @Column(name="Phone_Number", unique = true, length = 13, nullable = false)
    private String parentPhoneNumber;

    @NotNull
    @Email
    @Column(name="Email", unique = true, nullable = false)
    private String parentEmail;

    public ParentEntity(String parentFirstName, String parentMiddleName, String parentLastName, String parentSSN, AddressEntity addressEntity, String parentPhoneNumber, String parentEmail) {
        this.parentFirstName = parentFirstName;
        this.parentMiddleName = parentMiddleName;
        this.parentLastName = parentLastName;
        this.parentSSN = parentSSN;
        this.addressEntity = addressEntity;
        this.parentPhoneNumber = parentPhoneNumber;
        this.parentEmail = parentEmail;
    }

}
