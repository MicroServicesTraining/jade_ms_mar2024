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
@RequestMapping("/api/v1/admin")
public class AdminController {
	@GetMapping("/welcome")
	public String sayHello() {
		return "Welcome Admin...!";
	}
	
	@GetMapping("/addstudent")
	public String addStudent() {
		return "Add new student";
	}
	
	@GetMapping("/addteacher")
	public String addTeacher() {
		return "Add new teacher";
	}
}
