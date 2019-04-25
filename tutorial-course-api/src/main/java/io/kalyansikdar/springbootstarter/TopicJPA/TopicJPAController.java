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
	private TopicJPAService topicService;
	
	@RequestMapping("/topics")
	public List<TopicJPA> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topic/{id}")
	public TopicJPA getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody TopicJPA topic) {
		topicService.addTopics(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@PathVariable String id, @RequestBody TopicJPA topic) {
		topicService.updateTopics(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
