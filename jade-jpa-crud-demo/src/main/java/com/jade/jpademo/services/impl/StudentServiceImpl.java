/**
 * 
 */
package com.jade.jpademo.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.google.protobuf.Option;
import com.jade.jpademo.ErrorResponse;
import com.jade.jpademo.entities.Student;
import com.jade.jpademo.repositories.StudentRepository;
import com.jade.jpademo.responses.StudentServiceResponse;
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
		// select * from student where roll_no = {rollNo}
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
			//dbStudent.setRollNo(student.getRollNo());
			studentRepository.save(dbStudent);
			return "Student Modified successfully";
		} else {
			return "No student available with given roll number";
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> ResponseEntity<T> findStudentsByCourse(String course) {
		List<Student> studentsList;
		Optional<List<Student>> studentsListResult = studentRepository.findByCourse(course);
		if(studentsListResult.isPresent() && !CollectionUtils.isEmpty(studentsListResult.get())) {
			studentsList = studentsListResult.get();
			return (ResponseEntity<T>) new ResponseEntity<List<Student>>(HttpStatus.OK).of(studentsListResult);
		} else {
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setCode("NO_DATA_FOUND");
			errorResponse.setType("NON_AVAILBLE");
			errorResponse.setMessage("No Students enrolled for the given course");
			//studentsList = new ArrayList<Student>();
			return (ResponseEntity<T>) new ResponseEntity<ErrorResponse>(HttpStatus.OK).ok(errorResponse );
		}
	}
	
	@Override
	public <T> StudentServiceResponse<T> fetchStudentsNameStartsWith(String namePart) {
		List<Student> studentsList;
		Optional<List<Student>> studentsListResult = studentRepository.fetchStudentsNameStartsWith(namePart);
		if(studentsListResult.isPresent() && !CollectionUtils.isEmpty(studentsListResult.get())) {
			studentsList = studentsListResult.get();
			return (StudentServiceResponse<T>) new StudentServiceResponse<List<Student>>(studentsList, null);
		} else {
			ErrorResponse errorResponse = new ErrorResponse();
			errorResponse.setCode("NO_DATA_FOUND");
			errorResponse.setType("NON_AVAILBLE");
			errorResponse.setMessage("No Students with the given part of name");
			return (StudentServiceResponse<T>) new StudentServiceResponse<ErrorResponse>(errorResponse, "no students data available for this search");
		}
	}

	@Override
	public <T> StudentServiceResponse<T> addNewStudentsList(List<Student> newStudentsList) {
		//validate input here
		List<Student> savedStudentsList = studentRepository.saveAll(newStudentsList);
		Integer savedStudentsCount = Optional.ofNullable(savedStudentsList).orElse(new ArrayList<Student>()).size();
		if(savedStudentsCount > 0) {
			return (StudentServiceResponse<T>) new StudentServiceResponse<String>(savedStudentsCount + " students added successfully", null);
		} else {
			return (StudentServiceResponse<T>) new StudentServiceResponse<String>(null, "There is some problem in saving students, please try again");
		}
	}

	@Override
	public List<Student> findStudentsByName(String name) {
		List<Student> studentsList = null;
		Optional<List<Student>> studentsListResult = studentRepository.findByName(name);
		if(studentsListResult.isPresent()) {
			studentsList = studentsListResult.get();
		} else {
			studentsList = new ArrayList<Student>();
		}
		return studentsList;
	}

	@Override
	public Student findStudent(Integer rollNo) {
		Optional<Student> result =  studentRepository.findById(rollNo);
		if(result.isPresent()) {
			return result.get();
		} else {
			return null;
		}
	}
	
	
		
}
