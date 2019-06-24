package io.javabrains.springbootstarter.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

	@Id
	private String id;
	private String nmae;
	private String description;
	
	public Topic() {
	
	} 
	
	public Topic(String id, String nmae, String description) {
		super();
		this.id = id;
		this.nmae = nmae;
		this.description = description;
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
}
