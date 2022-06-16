package com.ce.spring.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        System.out.println("Welcome to Student Management System Lab!!!");
    }
}
