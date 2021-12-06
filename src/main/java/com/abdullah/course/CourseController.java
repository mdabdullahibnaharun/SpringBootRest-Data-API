package com.abdullah.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah.tropic.Tropic;


@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@RequestMapping("tropics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/tropic/{id}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST , value = "/tropics/{tropicId}/courses")
	public void addCourse(@RequestBody Course course,@PathVariable String tropicId) {
		course.setTropic(new Tropic(tropicId,"",""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/tropics/{tropicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable String tropicId,@PathVariable String id) {
		course.setTropic(new Tropic(tropicId,"",""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/tropics/{tropicId}/courses/{id}")
	public void updateTropic(@PathVariable String id) {
		courseService.deleteCourse(id);
	}

}