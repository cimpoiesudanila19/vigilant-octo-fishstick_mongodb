package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository) {
		return args -> {
			Address address = new Address(
					"Moldova",
					"Chishinau",
					"ZXC"
			);
			Student student = new Student(
					"Danila",
					"Cimpoiesu",
					"danila.cimpoiesu@mail.ru",
					Gender.MALE,
					address,
					List.of("Computer science"),
					BigDecimal.TEN,
					LocalDateTime.now()
			);

			repository.save(student);
			repository.findAll().stream().forEach(student1 -> System.out.println(student));
		};
	}

}
