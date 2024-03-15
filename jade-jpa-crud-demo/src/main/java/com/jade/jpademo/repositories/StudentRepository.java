/**
 * 
 */
package com.jade.jpademo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jade.jpademo.entities.Student;

/**
 * 
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	Optional<List<Student>> findByName(String name);
	
	Optional<List<Student>> findByCourse(String course);

	//JPQL query parameters are two type 
	// -> positional parameters
	// -> named parameters
	//@Query(name = "fetchStudentsNameStartsWith", value = "select s from Student s where s.name like %:namePart%")
	@Query(name = "fetchStudentsNameStartsWith", value = "select s from Student s where s.name like %?1%")
	Optional<List<Student>> fetchStudentsNameStartsWith(@Param(value = "namePart") String namePart);
	
	@Query(name = "fetchStudentsRollNumbersBetween", 
			value = "select * from students where st_roll_no > :start and st_roll_no < :end", nativeQuery = true)
	//@Query(name = "fetchStudentsRollNumbersBetween", value = "select s from Student s where s.rollNo > :start and s.rollNo < :end")
	//@Query(name = "fetchStudentsRollNumbersBetween", value = "select s from Student s where s.rollNo > ?1 and s.rollNo < ?2")
	Optional<List<Student>> fetchStudentsRollNumbersBetween(@Param(value = "start") Integer start, @Param(value = "end") Integer end);
	
}
