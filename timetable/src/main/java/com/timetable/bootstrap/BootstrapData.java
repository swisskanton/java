package com.timetable.bootstrap;

import com.timetable.domain.Course;
import com.timetable.domain.Student;
import com.timetable.repositories.CourseRepository;
import com.timetable.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class BootstrapData implements CommandLineRunner {

    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;

    public BootstrapData(CourseRepository courseRepository, StudentRepository studentRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Student  bob = new Student("Bob", "Dylan");
        Student bobSaved = studentRepository.save(bob);

        Student  john = new Student("John", "Lennon");
        Student johnSaved = studentRepository.save(john);

        Course math = new Course("Elementary mathematics", "Math");
        Course mathSaved = courseRepository.save(math);

        Course lang = new Course("French", "Foreign language");
        Course langSaved = courseRepository.save(lang);

        bobSaved.getSubjects().add(mathSaved);
        bobSaved.getSubjects().add(langSaved);
        studentRepository.save(bobSaved);

        johnSaved.getSubjects().add(langSaved);
        studentRepository.save(johnSaved);

        mathSaved.getStudents().add(bobSaved);
        courseRepository.save(mathSaved);

        langSaved.getStudents().add(bobSaved);
        langSaved.getStudents().add(johnSaved);
        courseRepository.save(langSaved);
    }
}
