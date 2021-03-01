package com.mike.StringsHww;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annoation.RequestingMapping;
import org.springframework.web.bind.annoation.RestController;


@SpringBootApplication
@RestController
public class StringsHwApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsHwApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "hello world!";
	}
	@RequestMapping("/")
	public String hello() {
		return "Hello client, how are you doing";
	}
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is awesome!";
	}

}
