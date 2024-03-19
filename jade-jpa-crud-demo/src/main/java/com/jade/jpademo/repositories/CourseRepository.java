/**
 * 
 */
package com.jade.jpademo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jade.jpademo.entities.Course;

/**
 * 
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
