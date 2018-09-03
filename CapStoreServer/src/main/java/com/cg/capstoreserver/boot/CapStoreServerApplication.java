package com.cg.capstoreserver.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.cg.capstoreserver.bean")
@ComponentScan("com.cg.capstoreserver")
@EnableJpaRepositories("com.cg.capstoreserver.repo")
public class CapStoreServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapStoreServerApplication.class, args);
	}
}
