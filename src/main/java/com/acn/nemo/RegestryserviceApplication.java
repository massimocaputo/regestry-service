package com.acn.nemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegestryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegestryserviceApplication.class, args);
	}

}
