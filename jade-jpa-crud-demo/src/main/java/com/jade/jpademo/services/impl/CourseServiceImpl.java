/**
 * 
 */
package com.jade.jpademo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jade.jpademo.entities.Course;
import com.jade.jpademo.repositories.CourseRepository;
import com.jade.jpademo.services.CourseService;

/**
 * 
 */
@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Course findCourseById(Long crsId) {
		return courseRepository.findById(crsId).orElseGet(null);
	}

}
