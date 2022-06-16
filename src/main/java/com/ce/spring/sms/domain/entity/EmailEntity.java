package com.ce.spring.sms.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Document(value = "emails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailEntity {

    @NotNull
    @Column(unique = true)
    private String name;

    @NotNull
    @Email
    private String fromEmail;

    @NotNull
    @Email
    private String toEmail;

    @NotNull
    private String subject;

    @NotNull
    private String content;

    @NotNull
    @CreatedDate
    private Date sendingDate;
}
