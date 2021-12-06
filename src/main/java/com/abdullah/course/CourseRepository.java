package com.abdullah.course;


import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course,String> {
	
	public List<Course> getCoursesByTropicId(String tropicId);
	public List<Course> findByName(String name);
	public List<Course> findByTropicId(String tropicId);

}
