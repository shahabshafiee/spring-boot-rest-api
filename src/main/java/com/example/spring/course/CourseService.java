package com.example.spring.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	public List<Course> getAllCourses(String id){
		List<Course> courses=  new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getCourse(String id){
		return	courseRepository.findById(id);
		
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
		
//		for (int i = 0; i < topics.size(); i++){
//			Topic t = topics.get(i);
//			if (t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		
	}

	public void deleteCourse(String id) {
	courseRepository.deleteById(id);
		
//		topics.removeIf(t -> t.getId().equals(id));
		
	}
}






















