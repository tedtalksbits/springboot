package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@GetMapping
	public String getHome(){

		String welcomeMessage = "<h1>Welcome to the Students api!</h1>";
		welcomeMessage+= "<br>";
		welcomeMessage+= "<p>For a list of all students go to: </p>";
		welcomeMessage+= "<a href='http://localhost:8080/api/v1/students'>/students</a>";
		return welcomeMessage;
	}

}
