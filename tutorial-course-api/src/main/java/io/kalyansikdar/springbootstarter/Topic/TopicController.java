package io.kalyansikdar.springbootstarter.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("Java Spring Boot", "JSB", "Java Spring Boot Tutorial"),
				new Topic("Front-End Development", "FED", "Udemy Front-End Tutorial"),
				new Topic("Python Django", "PD", "Youtube Python Django Tutorial"),
				new Topic("AWS Tutorial", "AWS", "AWS Tutorial Certification")
				);
	}
}
