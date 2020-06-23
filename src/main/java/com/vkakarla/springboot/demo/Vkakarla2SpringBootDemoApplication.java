package com.vkakarla.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(value = "com.vkakarla.springboot.rest.demo")
@EnableSwagger2
public class Vkakarla2SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Vkakarla2SpringBootDemoApplication.class, args);
	}

	@Bean
	public Docket saggerapi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.vkakarla.springboot.rest.demo.controller")).build();
	}

}
