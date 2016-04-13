package br.com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("br.com.domain")
@EnableJpaRepositories("br.com.repositories")
@ComponentScan({"br.com.service", "br.com.controller"})
public class WebAppConfig {
	
	public static void main(String[] args) {
		SpringApplication.run(WebAppConfig.class, args);
	}
}