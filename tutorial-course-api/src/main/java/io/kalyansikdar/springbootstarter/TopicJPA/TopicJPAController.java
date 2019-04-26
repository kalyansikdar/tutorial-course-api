package io.kalyansikdar.springbootstarter.TopicJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicJPAController {
	
	@Autowired
	private TopicJPAService topicJPAService;
	
	@RequestMapping("/topicsJPA")
	public List<TopicJPA> getAllTopics(){
		return topicJPAService.getAllTopics();
	}
	
	@RequestMapping("/topicJPA/{id}")
	public TopicJPA getTopic(@PathVariable String id) {
		return topicJPAService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topicsJPA")
	public void addTopic(@RequestBody TopicJPA topic) {
		topicJPAService.addTopics(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topicsJPA/{id}")
	public void updateTopic(@PathVariable String id, @RequestBody TopicJPA topic) {
		topicJPAService.updateTopics(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topicsJPA/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicJPAService.deleteTopic(id);
	}
}
