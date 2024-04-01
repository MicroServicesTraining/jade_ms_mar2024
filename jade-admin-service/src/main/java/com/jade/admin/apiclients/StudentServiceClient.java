/**
 * 
 */
package com.jade.admin.apiclients;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.jade.admin.model.Student;

/**
 * 
 */
@Component
public class StudentServiceClient {

	public List<Student> fetchAllStudents() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List> response =  restTemplate.getForEntity("http://STUDENTSERVICE/api/v1/students/all", List.class);
		return response.getBody();
	}

	
}
