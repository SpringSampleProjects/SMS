package com.ce.spring.sms.service;

import com.ce.spring.sms.domain.request.EmailRequestModel;

public interface EmailService {

    void sendingEmail(EmailRequestModel emailRequestModel);
}
