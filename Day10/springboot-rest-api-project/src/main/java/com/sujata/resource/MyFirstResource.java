package com.sujata.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstResource {

	@GetMapping(path = "/myresource",produces = MediaType.TEXT_PLAIN_VALUE)
	public String firstResource() {
		return "<h1>Welcome to first Rest API</h1>";
	}
	
	@GetMapping(path = "/myhtmlresource",produces = MediaType.TEXT_HTML_VALUE)
	public String secondResource() {
		return "<h1>Welcome to first Rest API</h1>";
	}
	
}
