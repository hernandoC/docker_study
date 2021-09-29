package com.example.docker.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DockerApplication {

	@GetMapping("/")
	public String home() {
		return "Hello Docker World";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
