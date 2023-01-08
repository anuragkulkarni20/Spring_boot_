package com.springrest.Springrest.entities;

public class Course {
	//initalize the variable
	private long id;
	
	private String title;
	
	private String description;

	
	
	
	

	// parameterized constructor
	
	public Course(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
// default constructore
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	
		
	// careate getter and setters and to string method and constructors
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	// to string method
	
	

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + "]";
	}


	
// closer of main class course	
}
