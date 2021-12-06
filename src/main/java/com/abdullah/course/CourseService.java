package com.abdullah.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

//	private List<Course> tropics = new ArrayList<>( Arrays.asList(
//			new Tropic("spring", "Spring Framework", "Spring Framework Description"),
//			new Tropic("java", "core java", "java description"),
//			new Tropic("javascript", "javascript", "js descripton")));

	public List<Course> getAllCourses(String tropicId) {

//		return tropics;

		List<Course> tropics = new ArrayList<>();
		courseRepository.findByTropicId(tropicId).forEach(tropics::add);
		return tropics;

	}

	public Course getCourse(String id) {

//		return tropics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
//		courseRepository.findByName("java");
		
		Course st = null;
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		for (int i = 0; i < courses.size(); i++) {
			Course s = courses.get(i);
			if (s.getId().equals(id)) {
				st = s;
			}
		}
		
		return st;
	}

	public void addCourse(Course course) {
//		tropics.add(tropic);

		courseRepository.save(course);
	}

	public void updateCourse(Course course) {

//		for(int i = 0 ; i<tropics.size() ; i++) {
//			Tropic t = tropics.get(i);
//			if(t.getId().equals(id)) {
//				tropics.set(i, tropic);
//				return;
//			}
//		}
		
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
//		tropics.removeIf(t -> t.getId().equals(id));
		courseRepository.deleteById(id);
	}

}
