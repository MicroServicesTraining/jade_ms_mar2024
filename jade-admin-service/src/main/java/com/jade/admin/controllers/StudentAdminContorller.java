/**
 * 
 */
package com.jade.admin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jade.admin.model.Student;
import com.jade.admin.services.StudentAdminService;

/**
 * 
 */
@RestController
@RequestMapping("/api/v1/admin")
public class StudentAdminContorller {

	@Autowired
	private StudentAdminService studentAdminService;

	@RequestMapping("/allstudents")
	public List<Student> fetchAllStudents(){
		return studentAdminService.fetchAllStudents();
	}
}
