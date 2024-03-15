/**
 * 
 */
package com.jade.jpademo.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jade.jpademo.entities.Student;
import com.jade.jpademo.responses.StudentServiceResponse;

/**
 * 
 */
public interface StudentService {

	List<Student> fetchAllStudents();

	Student addNewStudent(Student student);

	String removeStudent(Integer rollNo);

	String modifyStudent(Student student);

	Student findStudent(Integer rollNo);

	List<Student> findStudentsByName(String name);

	<T> ResponseEntity<T> findStudentsByCourse(String course);

	<T> StudentServiceResponse<T> addNewStudentsList(List<Student> newStudentsList);

	<T> StudentServiceResponse<T> fetchStudentsNameStartsWith(String namePart);

}
