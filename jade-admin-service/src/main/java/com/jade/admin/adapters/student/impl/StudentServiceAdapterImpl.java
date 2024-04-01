/**
 * 
 */
package com.jade.admin.adapters.student.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jade.admin.adapters.student.StudentServiceAdapter;
import com.jade.admin.model.Student;

/**
 * 
 */
@Component
public class StudentServiceAdapterImpl implements StudentServiceAdapter {

	@Autowired
	private com.jade.admin.apiclients.StudentServiceClient studentServiceClient;
	@Override
	public List<Student> fetchAllStudents() {
		// TODO Auto-generated method stub
		return studentServiceClient.fetchAllStudents();
	}

}
