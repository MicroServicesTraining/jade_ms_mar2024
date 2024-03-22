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
@RequestMapping("/api/v1/student")
public class StudentController {
	@GetMapping("/welcome")
	public String sayHello() {
		return "Welcome Student...!";
	}
	
	@GetMapping("/writeexam")
	public String writeexam() {
		return "Student writing exam";
	}
	
	@GetMapping("/checkresult")
	public String checkResult() {
		return "Student Result";
	}
}
