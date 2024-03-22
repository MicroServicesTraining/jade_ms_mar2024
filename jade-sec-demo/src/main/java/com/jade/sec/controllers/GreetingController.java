/**
 * 
 */
package com.jade.sec.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@RequestMapping("/api/v1/greet")
public class GreetingController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello User...!";
	}
	
	@GetMapping("/welcome")
	public String showWelcome() {
		return "Welcome User...!";
	}
}
