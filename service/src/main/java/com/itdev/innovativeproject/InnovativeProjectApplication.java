package com.itdev.innovativeproject;

import com.itdev.innovativeproject.dao.repository.ComputerDetailsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InnovativeProjectApplication {

    public static void main(String[] args) {
        var run = SpringApplication.run(InnovativeProjectApplication.class, args);
    }

}
