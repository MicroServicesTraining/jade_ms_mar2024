/**
 * 
 */
package com.jade.oauth2.controllers;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController("/api/v1/demo")
public class DemoController {
	
	// http://localhost:8080/api/v1/demo/welcome
	@GetMapping("/welcome")
	public String showWelcomeMessage() {
		return "Welcome User";
	}
	
	@GetMapping("/userhome")
	public String getUserHome(Principal pricipal) {
		return "Welcome User : " + pricipal.getName();
	}
	
	@GetMapping("/adminhome")
	public String getAdminHome() {
		return "Welcome Admin ";
	}
	

}
