/**
 * 
 */
package com.jade.banking.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("/banking")
public class BankingService {
	
	@GetMapping("/balmsg")
	public String getBalanceMessage() {
		return "Your have sufficient balance in your accont";
	}
}
