/**
 * 
 */
package com.mm.sbdemo.model.repositories;

import java.util.List;

import com.mm.sbdemo.model.StudentDB;
import com.mm.sbdemo.model.entities.Student;

/**
 * 
 */
public class StudentRepository {

	StudentDB studentDb = new StudentDB();
	
	public List<Student> fetchAllStudentsInfo(){
		return studentDb.select();
	}
	
	public int creatStudent(Student student) {
		return studentDb.insert(student);
	}

	public int removeStudent(int rollNo) {
		return studentDb.delete(rollNo);
	}

	public int modifyStudent(Student student) {
		return studentDb.update(student);
	}
}
