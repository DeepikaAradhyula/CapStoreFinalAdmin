package com.cg.capstoreclient.CapStoreClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg.capstoreclient.controller")
public class CapStoreClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapStoreClientApplication.class, args);
	}
}
