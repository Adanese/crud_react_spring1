package com.crud_react_spring1.services;

import java.util.List;

import com.crud_react_spring1.entities.Course;

public interface CourseService {
 public List<Course> getCourses();

 public Course getCourse(long courseId);

}
