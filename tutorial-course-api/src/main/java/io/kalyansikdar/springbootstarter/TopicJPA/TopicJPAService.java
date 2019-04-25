package io.kalyansikdar.springbootstarter.TopicJPA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.kalyansikdar.springbootstarter.Topic.Topic;

@Service
public class TopicJPAService {
	
	@Autowired
	private TopicJPARepository topicJPARepository;
	
	private List<TopicJPA> topics = new ArrayList<>(Arrays.asList(
			new TopicJPA("Java Spring Boot", "JSB", "Java Spring Boot Tutorial"),
			new TopicJPA("Front-End Development", "FED", "Udemy Front-End Tutorial"),
			new TopicJPA("Python Django", "PD", "Youtube Python Django Tutorial"),
			new TopicJPA("AWS Tutorial", "AWS", "AWS Tutorial Certification")
			));
	
	List<TopicJPA> getAllTopics(){
		List<TopicJPA> allTopics = new ArrayList<>();
		topicJPARepository.findAll().forEach(allTopics::add);	// usage of method reference: 
																// for each element of allTopics, 
																// add() method is being called
		return allTopics;
	}

	public TopicJPA getTopic(String id) {
		for (TopicJPA topic: topics) {
			if (topic.getId().equals(id)) {
				return topic;
			}
		}
		return null;
//		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public void addTopics(TopicJPA topic) {
		topics.add(topic);
	}

	public void updateTopics(String id, TopicJPA topic) {
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
