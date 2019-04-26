package io.kalyansikdar.springbootstarter.Course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.kalyansikdar.springbootstarter.TopicJPA.TopicJPA;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topicsJPA/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id){
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/topicsJPA/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topicsJPA/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		TopicJPA topicJPA = new TopicJPA("", topicId, "");
		course.setTopicJPA(topicJPA);
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topicsJPA/{topicId}/courses/{id}")
	public void updateCourse(@PathVariable String topicId, @PathVariable String id, @RequestBody Course course) {
		TopicJPA topicJPA = new TopicJPA("", topicId, "");
		course.setTopicJPA(topicJPA);
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topicsJPA/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
