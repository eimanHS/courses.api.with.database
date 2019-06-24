package io.javabrains.springbootstarter.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topics.Topic;

@Entity
public class Course {

	@Id
	private String id;
	private String nmae;
	private String description;
	
	@ManyToOne
	private Topic topic;
	
	public Course() {
	
	} 
	
	public Course(String id, String nmae, String description , String topicId ) {
		super();
		this.id = id;
		this.nmae = nmae;
		this.description = description;
		
		this.topic= new Topic(topicId , "" ,"");
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNmae() {
		return nmae;
	}
	
	public void setNmae(String nmae) {
		this.nmae = nmae;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
