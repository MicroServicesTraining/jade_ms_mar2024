package com.jade.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JadeAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JadeAdminServiceApplication.class, args);
	}

}
