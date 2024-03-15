/**
 * 
 */
package com.jade.jpademo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jade.jpademo.entities.Student;
import com.jade.jpademo.responses.StudentServiceResponse;
import com.jade.jpademo.services.StudentService;

/**
 * 
 */
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/all")
	public List<Student> fetchAllStudents(){
		return studentService.fetchAllStudents();
	}
	
	@PostMapping("/new")
	public Student addNewStudent(@RequestBody Student student) {
		return studentService.addNewStudent(student);
	}
	
	@DeleteMapping("/remove/rollNo/{rollNo}")
	public String removeStudent(@PathVariable Integer rollNo) {
		return studentService.removeStudent(rollNo);
	}
	
	@PutMapping("/modify")
	public String modifyStudent(@RequestBody Student student) {
		return studentService.modifyStudent(student);
	}
	
	@GetMapping("/findstudent/rollno/{rollNo}")
	public Student findStudent(@PathVariable Integer rollNo) {
		return studentService.findStudent(rollNo);
	}
	
	@GetMapping("/findstudentsbyname/name/{name}")
	public List<Student> findStudentsByName(@PathVariable String name) {
		return studentService.findStudentsByName(name);
	}
	
	@GetMapping("/findstudentsbycourse/course/{course}")
	public <T> ResponseEntity<T> findStudentsByCourse(@PathVariable String course){
		return studentService.findStudentsByCourse(course);
	}
	
	@GetMapping("/fetchStudentsNameStartsWith/nametoken/{nameToken}")
	public <T> StudentServiceResponse<T> fetchStudentsNameStartsWith(@PathVariable(name = "nameToken") String namePart){
		return studentService.fetchStudentsNameStartsWith(namePart);
	}
	
	@PostMapping("/newstudentslist")
	public <T> StudentServiceResponse<T> addNewStudentsList(@RequestBody List<Student> newStudentsList) {
		return studentService.addNewStudentsList(newStudentsList);		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
