package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index(HttpRequest request) {
		HttpHeaders headers = request.getHeaders();
		return "Greetings from Spring Boot33333333999DDDDDDDD测试!";
	}

}
