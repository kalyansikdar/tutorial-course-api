package io.kalyansikdar.springbootstarter.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("Java Spring Boot", "JSB", "Java Spring Boot Tutorial"),
			new Topic("Front-End Development", "FED", "Udemy Front-End Tutorial"),
			new Topic("Python Django", "PD", "Youtube Python Django Tutorial"),
			new Topic("AWS Tutorial", "AWS", "AWS Tutorial Certification")
			);
	
	List<Topic> getAllTopics(){
		return this.topics;
	}

	public Topic getTopic(String id) {
		for (Topic topic: topics) {
			if (topic.getId().equals(id)) {
				return topic;
			}
		}
		return null;
	}
}
