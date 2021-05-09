package com.crud_react_spring1.services;

import java.util.List;

import com.crud_react_spring1.entities.Course;

public interface CourseService {
 public List<Course> getCourses();

 public Course getCourse(long courseId);

 public Course addCourse(Course course);

// public void removeCourse(long parseLong);

public Course updateCourse(Course course);

public void deleteCourse(long parseLong);
}
