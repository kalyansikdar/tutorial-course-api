package io.kalyansikdar.springbootstarter.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Java Spring Boot", "JSB", "Java Spring Boot Tutorial"),
			new Topic("Front-End Development", "FED", "Udemy Front-End Tutorial"),
			new Topic("Python Django", "PD", "Youtube Python Django Tutorial"),
			new Topic("AWS Tutorial", "AWS", "AWS Tutorial Certification")
			));
	
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
//		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public void addTopics(Topic topic) {
		topics.add(topic);
	}

	public void updateTopics(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
				return; // whenever the item is replaces, function returns
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(topic -> topic.getId().equals(id));
	}
}
