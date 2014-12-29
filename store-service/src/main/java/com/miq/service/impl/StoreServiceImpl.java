package com.miq.service.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

import com.miq.service.StoreService;

@Component
@Path("/search")
public class StoreServiceImpl implements StoreService {

	@GET
	@Override
	public String getStore() {
		return "MG Road Store";
	}

}
