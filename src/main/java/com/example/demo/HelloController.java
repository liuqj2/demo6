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
		return "Greetings from Spr2ing Bossot33333333999DsssDDDDDsDD1测试!";
	}

}
