package com.aniket.StudentManagementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    public Student getStudent(int regNo) {
        return studentRepository.getStudent(regNo);
    }

    public Student updateAge(int regNo, int age){
        return studentRepository.updateAge(regNo, age);
    }

    public String deleteStudent(int regNo){
        return studentRepository.deleteStudent(regNo);
    }

    public Student updateCourse(int regNo, String course){
        return studentRepository.updateCourse(regNo, course);
    }

    public Student updateCourseAge(int regNo, Student student){
        return studentRepository.updateCourseAge(regNo, student);
    }
}
