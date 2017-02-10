package com.virtualpairprogrammers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaServer
public class FleetmanRegistryApplication {
	public static void main(String[] args) {
		SpringApplication.run(FleetmanRegistryApplication.class, args);
	}
}
