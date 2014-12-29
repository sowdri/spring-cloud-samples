package com.miq.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.miq.service.impl.StoreServiceImpl;

@ApplicationPath("/jersey")
@Component
public class EndpointRegistry extends ResourceConfig {

	public EndpointRegistry() {
		register(StoreServiceImpl.class);
	}

}
