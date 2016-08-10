package com.vision.mp.rest.controller.authentication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationRESTController {

	@RequestMapping("/")
	public String home() {
		return "Home page";
	}
}
