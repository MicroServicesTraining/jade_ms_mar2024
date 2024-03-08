/**
 * 
 */
package com.jade.jpademo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "tbl_courses")
public class Course {

	@Id
	@Column(name = "crs_id")
	private Long courseId;
	
	@Column(name = "crs_name")
	private String name;
	
	@Column(name = "crs_fee")
	private Double fee;
	
	/**
	 * @return the courseId
	 */
	public Long getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
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
}
