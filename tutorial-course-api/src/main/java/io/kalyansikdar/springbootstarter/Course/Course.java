package io.kalyansikdar.springbootstarter.Course;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.kalyansikdar.springbootstarter.TopicJPA.TopicJPA;

@Entity
public class Course {
	
	private String name;
	@Id
	private String id;
	private String description;
	private TopicJPA topicJPA;
	
	public Course() {
		
	}
	
	public Course(String name, String id, String description, String topicJPAId) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
		this.setTopicJPA(new TopicJPA("", topicJPAId, ""));
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public TopicJPA getTopicJPA() {
		return topicJPA;
	}

	public void setTopicJPA(TopicJPA topicJPA) {
		this.topicJPA = topicJPA;
	}
}
