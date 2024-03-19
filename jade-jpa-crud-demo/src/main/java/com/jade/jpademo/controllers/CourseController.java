/**
 * 
 */
package com.jade.jpademo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jade.jpademo.entities.Course;
import com.jade.jpademo.services.CourseService;

/**
 * 
 */
@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	//http://localhost:8080/api/v1/courses/find/crsid/2001
	@GetMapping("/find/crsid/{crsId}")
	public Course findCourseById(@PathVariable Long crsId) {
		return courseService.findCourseById(crsId);
	}
	
	
}
