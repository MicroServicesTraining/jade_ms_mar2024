/**
 * 
 */
package com.jade.admin.model;

import java.util.Set;
/**
 * 
 */
public class Student {
	
	private Integer rollNo;
	
	private String name;
	
	private String course;
	
	private Address address;
	
	private Course joinedCourse;
	
	private Set<Certification> certifications;
	/**
	 * @return the rollNo
	 */
	public Integer getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the joinedCourse
	 */
	
	// public Course getJoinedCourse() { return joinedCourse; }
	 
	/**
	 * @param joinedCourse the joinedCourse to set
	 */
	public void setJoinedCourse(Course joinedCourse) {
		this.joinedCourse = joinedCourse;
	}
	/**
	 * @return the certifications
	 */
	public Set<Certification> getCertifications() {
		return certifications;
	}
	/**
	 * @param certifications the certifications to set
	 */
	public void setCertifications(Set<Certification> certifications) {
		this.certifications = certifications;
	}
	
}

