/**
 * 
 */
package com.jade.props.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.jade.props.PropsDemoConfig;

/**
 * 
 */
@Service
public class PropsDemoService {

	/*
	 * @Value("${jade.prop.banner}") private String banner;
	 */

	@Autowired
	private PropsDemoConfig propsDemoConfig;
	
	public String getBannerProperty() {
		return propsDemoConfig.getBanner();
	}
}
