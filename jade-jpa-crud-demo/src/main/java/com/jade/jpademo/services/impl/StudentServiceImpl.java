/**
 * 
 */
package com.jade.jpademo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jade.jpademo.entities.Student;
import com.jade.jpademo.repositories.StudentRepository;
import com.jade.jpademo.services.StudentService;

/**
 * 
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> fetchAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student addNewStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public String removeStudent(Integer rollNo) {
		Optional<Student> result = studentRepository.findById(rollNo);
		if(result.isPresent()) {
			studentRepository.delete(result.get());
			return "Student removed successfully";
		} else {
			return "No student available with given roll number";
		}
	}

	@Override
	public String modifyStudent(Student student) {
		Integer rollNo = student.getRollNo();
		Optional<Student> result = studentRepository.findById(rollNo);
		if(result.isPresent()) {
			Student dbStudent = result.get();
			dbStudent.setCourse(student.getCourse());
			dbStudent.setName(student.getName());
			studentRepository.save(dbStudent);
			return "Student Modified successfully";
		} else {
			return "No student available with given roll number";
		}
	}

}
