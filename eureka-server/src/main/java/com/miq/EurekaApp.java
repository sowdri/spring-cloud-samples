package com.miq;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableEurekaServer
public class EurekaApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaApp.class).web(true).run(args);
	}

}
