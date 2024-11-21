package ru.andrey.vasilev.spring.boot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		String s = "Паша";
		SpringApplication.run(Application.class, args);
	}
}
