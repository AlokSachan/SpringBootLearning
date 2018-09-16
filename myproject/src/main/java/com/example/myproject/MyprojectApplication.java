package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyprojectApplication {

    @RequestMapping("/")

    public String home(){
        return "First spring Boot application";
    }

	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}
}
