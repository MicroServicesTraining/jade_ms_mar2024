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
@RequestMapping("/api/v1/teacher")
public class TeacherController {
	@GetMapping("/welcome")
	public String sayHello() {
		return "Welcome Teacher...!";
	}
	
	@GetMapping("/evaluate")
	public String evaluateStudent() {
		return "Evaluate student";
	}
}
