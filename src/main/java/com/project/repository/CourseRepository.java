package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
