package com.ce.spring.sms.controller;

import com.ce.spring.sms.domain.request.EmailRequestModel;
import com.ce.spring.sms.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "emailController")
@RequestMapping(value = "/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping(value = "/sending")
    public void sendingEmail(@RequestBody EmailRequestModel emailRequestModel){
        emailService.sendingEmail(emailRequestModel);
    }

}
