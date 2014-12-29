package com.miq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class StoreApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(StoreApp.class).web(true).run(args);
	}

}
