package com.jade.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class JadeDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JadeDiscoveryServiceApplication.class, args);
	}

}
