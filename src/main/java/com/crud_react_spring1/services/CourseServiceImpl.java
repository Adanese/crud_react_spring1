package com.crud_react_spring1.services;

import java.util.ArrayList;
import java.util.List;

import com.crud_react_spring1.entities.Course;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

 List<Course> list;

 public CourseServiceImpl() {

  list = new ArrayList<>();
  list.add(new Course(145, "Java COurse", "this course bla bla"));
  list.add(new Course(4343, "Spring boot COurse", "Rest APi Spring boot"));
 }

 @Override
 public List<Course> getCourses() {
  // TODO Auto-generated method stub
  return list;
 }

 @Override
 public Course getCourse(long courseId) {
  // TODO Auto-generated method stub
  Course c = null;

  for (Course course : list) {
   if (course.getId() == courseId) {
    c = course;
    break;
   }
  }
  return c;
 }

 @Override
 public Course addCourse(Course course) {
  list.add(course);
  // TODO Auto-generated method stub
  return course;
 }

}
