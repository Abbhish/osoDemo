package com.abbhish.springWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWebApplication {
	
	
	
	@RequestMapping("/")
	public String home() {
		return "welcome to home page";
	}
	
	@RequestMapping("/page1")
	public String page1() {
		return "welcome to page 1";
	}

	public static void main(String[] args) {
		
		SpringApplication.run(SpringWebApplication.class, args);
		System.out.println("hello world");
	}

}
