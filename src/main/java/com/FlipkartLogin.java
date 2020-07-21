package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FlipkartLogin {

	
	@GetMapping("/Login")
	public String login() {
		return "mahabira01@gmail.com";
	}
	@GetMapping("/Password")
	public int password() {
		return 97293033;
}
}
