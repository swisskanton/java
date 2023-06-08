package com.timetable.services;

import com.timetable.domain.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseService{
    Iterable<Course> findAll();
}
