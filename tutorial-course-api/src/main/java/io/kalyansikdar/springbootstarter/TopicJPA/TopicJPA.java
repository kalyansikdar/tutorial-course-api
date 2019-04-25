package io.kalyansikdar.springbootstarter.TopicJPA;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TopicJPA {
	
	private String name;
	@Id
	private String id;
	private String description;
	
	public TopicJPA(String name, String id, String description) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
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
	
}
