package io.kalyansikdar.springbootstarter.TopicJPA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicJPAService {
	
	@Autowired
	private TopicJPARepository topicJPARepository;
	
	List<TopicJPA> getAllTopics(){
		List<TopicJPA> allTopics = new ArrayList<>();
		topicJPARepository.findAll().forEach(allTopics::add);	// usage of method reference: 
																// for each element of allTopics, 
																// add() method is being called
		return allTopics;
	}

	public TopicJPA getTopic(String id) {
		return topicJPARepository.findById(id).get();
	}

	public void addTopics(TopicJPA topic) {
		topicJPARepository.save(topic);
	}

	public void updateTopics(String id, TopicJPA topic) {
		topicJPARepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicJPARepository.deleteById(id);
	}
}
