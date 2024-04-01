/**
 * 
 */
package com.servicenow.jp.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@RequestMapping("/jp")
public class JobPostingController {
	private static final Logger LOGGER = LoggerFactory.getLogger(JobPostingController.class);
	
	@GetMapping("/jobposting")
	public String getJobPosting() throws InterruptedException {
		LOGGER.info("getJobPostingInfo() from JobPostingController");
		Thread.sleep(2000);
		return "Job Posting Information :8083";
	}
	
	@GetMapping("/jobcompany")
	public String getJobCompany() throws InterruptedException {
		LOGGER.info("getJobPostingInfo() from JobPostingController");
		Thread.sleep(2000);
		return "Job Company Information";
	}
	
}
