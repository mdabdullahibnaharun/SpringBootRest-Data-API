package com.abdullah.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.abdullah.tropic.Tropic;

@Entity
public class Course {
	
	@Id
	private String id;
	
	private String name;
	
	private String description;
	@ManyToOne
	private Tropic tropic;
	
	public Course() {
		super();
	}

	public Course(String id, String name, String description,String tropicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.tropic = new Tropic(tropicId,"","");
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

	public Tropic getTropic() {
		return tropic;
	}

	public void setTropic(Tropic tropic) {
		this.tropic = tropic;
	}

	@Override
	public String toString() {
		return "Tropic [id=" + id + ", name=" + name + ", description=" + description + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getDescription()=" + getDescription() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
