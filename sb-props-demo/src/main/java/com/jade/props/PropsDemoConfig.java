/**
 * 
 */
package com.jade.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * 
 */
@Configuration
@ConfigurationProperties(prefix = "jade.prop")
@PropertySources({
	@PropertySource("classpath:jadeapp.properties"),
	@PropertySource("file:D:\\demo\\config\\demoapp.properties")
})
public class PropsDemoConfig {

	//@Value("${jade.prop.welcome}")
	private String welcome;
	
	//@Value("${jade.prop.banner:dummy banner}")
	private String banner;

	/**
	 * @return the welcomeProperty
	 */
	public String getWelcome() {
		return welcome;
	}

	/**
	 * @param welcomeProperty the welcomeProperty to set
	 */
	public void setWelcome(String welcomeProperty) {
		this.welcome = welcomeProperty;
	}

	/**
	 * @return the banner
	 */
	public String getBanner() {
		return banner;
	}

	/**
	 * @param banner the banner to set
	 */
	public void setBanner(String banner) {
		this.banner = banner;
	}
		
}
