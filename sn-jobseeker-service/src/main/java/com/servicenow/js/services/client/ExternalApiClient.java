/**
 * 
 */
package com.servicenow.js.services.client;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.servicenow.js.services.JobSeekerService;

/**
 * 
 */
@Component
public class ExternalApiClient {
	private static final Logger LOGGER = LoggerFactory.getLogger(ExternalApiClient.class);
	@Autowired
	private RestTemplate restTemplate;

	@Async
	public CompletableFuture<String> callJobPostingInfoApi() {
		LOGGER.info("callJobPostingInfoApi() from ExternalApiClient");
		String jobPostingInfo = restTemplate.getForObject("http://JOBPOSTINGS/jp/jobposting", String.class);
		return CompletableFuture.completedFuture(jobPostingInfo);
	}
	
	@Async
	public CompletableFuture<String> callJobCompanyInfoApi() {
		LOGGER.info("callJobCompanyInfoApi() from ExternalApiClient");
		String jobPostingCompany = restTemplate.getForObject("http://JOBPOSTINGS/jp/jobcompany", String.class);
		return CompletableFuture.completedFuture(jobPostingCompany);
	}
	
}
