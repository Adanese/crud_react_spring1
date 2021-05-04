package com.crud_react_spring1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crud_react_spring1.entities.Course;
import com.crud_react_spring1.services.CourseService;

@RestController
public class MyController {

	@Autowired
private CourseService courseService;



	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}

	// get courses
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();

	}

	@GetMapping("courses/{courseId}")
public Course getCourse(@PathVariable String courseId)	{
	return this.courseService.getCourse(Long.parseLong(courseId));
}

}
