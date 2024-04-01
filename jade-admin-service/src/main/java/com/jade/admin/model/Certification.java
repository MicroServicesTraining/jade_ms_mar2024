/**
 * 
 */
package com.jade.admin.model;

import java.util.Set;

/**
 * 
 */
public class Certification {

	private Integer certId;

	private String name;

	private Double fee;

	private Set<Student> students;

	/**
	 * @return the certId
	 */
	public Integer getCertId() {
		return certId;
	}

	/**
	 * @param certId the certId to set
	 */
	public void setCertId(Integer certId) {
		this.certId = certId;
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
	 * @return the fee
	 */
	public Double getFee() {
		return fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(Double fee) {
		this.fee = fee;
	}

	/**
	 * @return the students
	 */
	/*
	 * public Set<Student> getStudents() { return students; }
	 */
	/**
	 * @param students the students to set
	 */
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}
