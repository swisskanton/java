package com.timetable.services;

import com.timetable.domain.Student;
import com.timetable.repositories.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }
}
