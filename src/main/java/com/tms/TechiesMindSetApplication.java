package com.tms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "User API", version = "1.0.0", description = "User API doc"))
public class TechiesMindSetApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechiesMindSetApplication.class, args);
	}

}
