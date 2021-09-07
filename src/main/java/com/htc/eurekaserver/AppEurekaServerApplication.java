package com.htc.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableEurekaServer
@EnableWebMvc
public class AppEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppEurekaServerApplication.class, args);
	}

}
