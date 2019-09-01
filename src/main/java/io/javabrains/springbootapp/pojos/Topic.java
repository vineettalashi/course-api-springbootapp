package io.javabrains.springbootapp.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * This is the model or Entity class
 * 
 */
@Entity
public class Topic {
	@Id
	String id;
	String name;	
	String description;
	
	public Topic() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}	
	
	
	

}
