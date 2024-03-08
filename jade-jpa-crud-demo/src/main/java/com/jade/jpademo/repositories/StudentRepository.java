/**
 * 
 */
package com.jade.jpademo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jade.jpademo.entities.Student;

/**
 * 
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}