package com.zensar.olxadvertiesapplication;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OlxAdvertiesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OlxAdvertiesApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}

	@Bean
	public ModelMapper modeMapper() {
		return new ModelMapper();
	}

}
