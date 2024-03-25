/**
 * 
 */
package com.jade.props.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jade.props.PropsDemoConfig;
import com.jade.props.services.PropsDemoService;

/**
 * 
 */
@RestController
@RequestMapping("/api/v1/propsdemo")
public class PropsDemoController {

	/*
	 * @Value("${jade.prop.welcome}") private String welcomeProperty;
	 * 
	 * @Value("${jade.prop.banner}") private String banner;
	 */
	
	@Autowired
	private PropsDemoConfig propsDemoConfig;
	
	@Autowired
	private PropsDemoService propsDemoService;
	
	@GetMapping("/welcome")
	public String getWelcomePropertyValue() {
		return propsDemoConfig.getWelcome() +" :: "+ propsDemoConfig.getBanner();
	}
	
	@GetMapping("/banner")
	public String getJadeBanner() {
		return propsDemoService.getBannerProperty();
	}
}
