package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class Application implements CommandLineRunner 
{
    @Autowired
    private EmailService emailService;
 
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
     
    @Override
    public void run(String... args) 
    {
        emailService.sendMail("digambar1750@gmail.com", "Hi", "Ho ho ho");
         
        emailService.sendPreConfiguredMail("Ho ho ho");
    }
}
