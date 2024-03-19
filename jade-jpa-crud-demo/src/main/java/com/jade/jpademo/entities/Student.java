/**
 * 
 */
package com.jade.jpademo.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "students")
public class Student {

	@Id
	@Column(name = "st_roll_no")
	private Integer rollNo;
	
	//@Column(name = "name")
	private String name;
	
	@Column(name = "st_course")
	private String course;
	
	@OneToOne(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Address address;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "crs_id", nullable = false)
	private Course joinedCourse;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable( name = "students_certifications",
				joinColumns = {
						@JoinColumn(name = "sc_roll_no", referencedColumnName = "st_roll_no", nullable = false)
				},
				inverseJoinColumns = {
						@JoinColumn(name = "sc_cert_id", referencedColumnName = "cert_id", nullable = false)
				}				
			)
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
