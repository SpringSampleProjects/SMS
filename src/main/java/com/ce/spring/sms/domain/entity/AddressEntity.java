package com.ce.spring.sms.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Address")
@Data
@NoArgsConstructor
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long addressId;

    @NotNull
    @Column(name = "Country", nullable = false)
    private String country;

    @NotNull
    @Column(name = "State", nullable = false)
    private String state;

    @NotNull
    @Column(name="City", nullable = false)
    private String city;

    public AddressEntity(String country, String state, String city){
        this.country = country;
        this.state = state;
        this.city = city;
    }
}
