/**
 * 
 */
package com.jade.jpademo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jade.jpademo.entities.Student;

/**
 * 
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	Optional<List<Student>> findByName(String name);
	
	Optional<List<Student>> findByCourse(String course);
	
}
