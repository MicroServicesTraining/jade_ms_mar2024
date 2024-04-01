/**
 * 
 */
package com.jade.admin.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jade.admin.adapters.student.StudentServiceAdapter;
import com.jade.admin.model.Student;
import com.jade.admin.services.StudentAdminService;

/**
 * 
 */
@Service
public class StudentAdminServiceImpl implements StudentAdminService {

	@Autowired
	private StudentServiceAdapter studentServiceAdapter;
	
	@Override
	public List<Student> fetchAllStudents() {
		return studentServiceAdapter.fetchAllStudents();
	}

}
