package io.kalyansikdar.springbootstarter.Course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	List<Course> getAllCourses(String id){
		List<Course> allCourses = new ArrayList<>();
		courseRepository.findAll().forEach(allCourses::add);	// usage of method reference: 
																// for each element of allTopics, 
																// add() method is being called
		return allCourses;
	}

	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
