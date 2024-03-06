/**
 * 
 */
package com.mm.sbdemo.model;

import java.util.ArrayList;
import java.util.List;

import com.mm.sbdemo.model.entities.Student;

/**
 * 
 */
public class StudentDB {

	List<Student> students = new ArrayList<>();
	
	public List<Student> select(){
		return students;
	}
	
	public int insert(Student student) {
		students.add(student);
		return 1;
	}
	
	public int update(Student student) {
		System.out.println("Student updated");
		return 1;
	}
	
	public int delete(int rollNo) {
		System.out.println("Student deleted");
		return 1;
	}

	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
