/**
 * 
 */
package com.jade.jpademo.services;

import java.util.List;

import com.jade.jpademo.entities.Student;

/**
 * 
 */
public interface StudentService {

	List<Student> fetchAllStudents();

	Student addNewStudent(Student student);

	String removeStudent(Integer rollNo);

	String modifyStudent(Student student);

}
