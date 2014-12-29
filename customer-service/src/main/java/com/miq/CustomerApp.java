package com.miq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class CustomerApp {

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/")
	public String sayCustomer() {
		return "Customer Service: URL: "
				+ discoveryClient.getInstances("CUSTOMER").get(0).getPort();
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(CustomerApp.class).web(true).run(args);
	}
}
