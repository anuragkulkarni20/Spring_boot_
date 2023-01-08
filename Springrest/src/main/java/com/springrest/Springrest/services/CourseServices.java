package com.springrest.Springrest.services;

import java.util.List;

import com.springrest.Springrest.entities.Course;

public interface CourseServices {
	
	// create list getsource method
// shoe errors on list removing imprt list packge
//error -<courses> import entits packge	
	public List<Course> getCourses();
	// create class for these interface

	
	// creating courseid metod
	public Course getCourse(Long courseId);
	// now go cntroller method give value as long
	
	
	public Course addCourse(Course course);
	//interface closer


	public Course updateCourse(Course course);


	public void deleteCourse(long parseLong);


	//public Course updateCourse(Course course);
}
