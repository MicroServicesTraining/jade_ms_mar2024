/**
 * 
 */
package com.mm.sbdemo.services;

import java.util.List;

import com.mm.sbdemo.model.entities.Student;
import com.mm.sbdemo.model.repositories.StudentRepository;

/**
 * 
 */
public class StudentService {

	StudentRepository studentRepository = new StudentRepository();
	
	public List<Student> fetchAllStudentsInfo(){
		//validation, calculation, business rule logic
		return studentRepository.fetchAllStudentsInfo();
	}

	public int creatStudent(Student student) {
		return studentRepository.creatStudent(student);
	}

	public int removeStudent(int rollNo) {
		return studentRepository.removeStudent(rollNo);
	}

	public int modifyStudent(Student student) {
		return studentRepository.modifyStudent(student);
	}
	
}
