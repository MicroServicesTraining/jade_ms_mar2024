/**
 * 
 */
package com.jade.jpademo.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "certifications" )
public class Certification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cert_id")
	private Integer certId;
	
	private String name;
	private Double fee;
	
	@ManyToMany(mappedBy = "certifications", fetch = FetchType.LAZY)
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
