package br.ufc.trabalho_final_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class TrabalhoFinalWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoFinalWebApplication.class, args);
	}
}
