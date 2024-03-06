/**
 * 
 */
package com.mm.sbdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sbdemo.model.entities.Student;
import com.mm.sbdemo.services.StudentService;

/**
 * 
 */
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

	StudentService studentService = new StudentService();
	
	@GetMapping("/all")
	public List<Student> fetchAllStudentsInfo() {
		return studentService.fetchAllStudentsInfo();
	}
	
	@PostMapping("/new")
	public String creatStudent(@RequestBody Student student) {
		int result = studentService.creatStudent(student);
		return result + " student is created";
	}
	
	@DeleteMapping("/remove/{rollNo}")
	public String removeStudent(@PathVariable int rollNo) {
		int result = studentService.removeStudent(rollNo);
		return result + " student is removed and roll Number - " + rollNo;
	}
	
	@PutMapping("/modify")
	public String modifyStudent(@RequestBody Student student) {
		int result = studentService.modifyStudent(student);
		return result + " student is modified";
	}
}
