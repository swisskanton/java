package com.timetable.services;

import com.timetable.domain.Student;

public interface StudentService {
    Iterable<Student> findAll();
}
