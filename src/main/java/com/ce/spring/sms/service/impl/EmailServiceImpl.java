package com.ce.spring.sms.service.impl;

import com.ce.spring.sms.domain.entity.EmailEntity;
import com.ce.spring.sms.domain.request.EmailRequestModel;
import com.ce.spring.sms.repository.EmailRepository;
import com.ce.spring.sms.service.EmailService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Date;

@Service(value = "emailService")
public class EmailServiceImpl implements EmailService {

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendingEmail(EmailRequestModel emailRequestModel) {

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        EmailEntity emailEntity = mapRequestModelToEntity(emailRequestModel);

        try{
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(emailEntity.getFromEmail());
            mimeMessageHelper.setTo(emailEntity.getToEmail());
            mimeMessageHelper.setSubject(emailEntity.getSubject());
            mimeMessageHelper.setText(emailEntity.getContent());

            // Sending email
            javaMailSender.send(mimeMessageHelper.getMimeMessage());

            // Save sending email into mongodb
            emailRepository.save(emailEntity);
        } catch (MessagingException e){
            e.printStackTrace();
        }
    }

    private EmailEntity mapRequestModelToEntity(EmailRequestModel emailRequestModel){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        EmailEntity emailEntity = modelMapper.map(emailRequestModel, EmailEntity.class);

        emailEntity.setSendingDate(new Date());
        emailEntity.setName(emailEntity.getSubject() + "_"+emailEntity.getSendingDate());

        return emailEntity;
    }
}
