package com.ce.spring.sms.configuration;

import com.ce.spring.sms.domain.shared.EmailConfigDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@Lazy
public class EmailConfiguration {

    @Autowired
    private EmailConfigDto emailConfigDto;

    // Create a mail sender bean
    @Bean
    public JavaMailSender getMailSender(){
        JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();

        javaMailSenderImpl.setHost(emailConfigDto.getHost());
        javaMailSenderImpl.setPort(emailConfigDto.getPort());
        javaMailSenderImpl.setUsername(emailConfigDto.getUsername());
        javaMailSenderImpl.setPassword(emailConfigDto.getPassword());

        return javaMailSenderImpl;
    }
}
