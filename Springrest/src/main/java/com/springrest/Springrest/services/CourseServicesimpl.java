package com.springrest.Springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.Springrest.entities.Course;
//step1.

@Service
public class CourseServicesimpl implements CourseServices {

	//after this method created for temparory storing the data fetching it 
	// creaet list of courses
	
	//step2.
	List<Course> list;
	
	//step3 .create const of class
	
	public CourseServicesimpl() {
	
		// TODO Auto-generated constructor stub
	
		// adding temparory data into list
		
	list = new ArrayList<>();
	
	list.add(new Course(12,"Core java course", "It contains basics of java"));
	
	
	list.add(new Course(141,"Adavance java"," adavance java contains ,hiberante spring , spring boot"));
	}
	
	//step1.
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		
		//return null;
	
	return list;
	
	// now go to my controller 
	}

	@Override
	public Course getCourse(Long courseId) {
		// TODO Auto-generated method stub
		//giev value for particular course value
		
		Course c = null;
		
		for(Course course:list) {
			
			if(course.getId()==courseId) 
			{
				c= course;
				
				break;
				// if loop closer
			}
		// forloop closer
			
		}
		 
		
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
		
		 list.forEach(e->{
		if (e.getId()== course.getId()) {
			e.setTitle(course.getTitle());
			e.setDescription(course.getDescription());
		}	 
		 });
		 
		return course;
	
 
	
	
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
	
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}
}
