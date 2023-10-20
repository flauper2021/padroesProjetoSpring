package com.digitalinnovation.gofspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication

/**
 * Projeto Spring Boot gerado via Spring Initializr
 * Dependencias:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * @author MauricioJuica
 * 
 * Projeto criado na Aula do professor Flavio Junior do BootCamp Dio-Santander	 * 
 */

public class Application {
		
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
