package com.jade.cc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class JadeCloudConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JadeCloudConfigDemoApplication.class, args);
	}

}
