/**
 * 
 */
package com.mm.sbdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@RequestMapping("/api/v1/demo")
public class GreetingController {
	
	//  http://localhost:8080/api/v1/demo/greet
	@RequestMapping(path = "/greet", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello... world....!";
	}
	
	//http://localhost:8080/api/v1/demo/goodevening
	//@RequestMapping(path = "/goodevening", method = RequestMethod.GET)
	@GetMapping(path = "/goodevening")
	public String sayGoodEvening() {
		return "Good eveing";
	}
	
}
