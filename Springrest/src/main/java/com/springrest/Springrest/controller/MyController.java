package com.springrest.Springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.Springrest.entities.Course;
import com.springrest.Springrest.services.CourseServices;
//stp 1 .write @restcontroller annoation & import it
@RestController
public class MyController { 
	
	//2. write any method with return type  and giev get mapping annoation 
	
	// 9 decalre varibale of serviceimpl
	// 10 error will show , imprt services
	//12 write @autowired
	
	@Autowired
	private CourseServices courseServices;
	
	@GetMapping("/home")
	public String home()
	{
		
		return "Welcome to courses application ";
	
		// 3.run
		// closer of home method
	}

	// 4.getting  all the courses list use Getmapping annoation
	// 5.create new method 
	// 6.it will show error , create course class,in enetity package, 
	// 7.now list will show error ,create list of courses
// now create interface of courses services in service package
	@GetMapping("/courses")
	public List <Course> getCourses()
	{
	//8 now we need object of severiceimpl class	
	
		
		// 11 return statment
		
		return this.courseServices.getCourses();
		
		
	// closer of course method
	}
	
	//13 getting particular course using it id
	// creating new method
	//15 write annotation
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		//14
		return this.courseServices.getCourse(Long.parseLong(courseId));
		//15 go to interface create course id method
		
		//16 go to implemented method add unimpememnted methdo
		// closer of get cousersmethod
	}
	// creating postmapping for adding course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
		return this.courseServices.addCourse(course);
	// adding course to after running scssufuly	
	}
	

	
	  @PutMapping("/courses")
	  public Course updateCourse(@RequestBody Course course) 
	  {
	  
	  return this.courseServices.updateCourse(course); 
	  
	  }
	  




@DeleteMapping("/courses/{courseId}")

public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
{
	try {
		this.courseServices.deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
		
		}
	catch(Exception e) 
	{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
 }
}

// running succfulyy give result localhost 8080
