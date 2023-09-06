package com.aniket.StudentManagementApp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer, Student> db = new HashMap<>();

    public String addStudent(Student student) {
        db.put(student.getRegNo(), student);
        return "Student has been added successfully";
    }

    public Student getStudent(int regNo) {
        return db.get(regNo);
    }

    public Student updateAge(int regNo, int age){
        db.get(regNo).setAge(age);
        return db.get(regNo);
    }

    public String deleteStudent(int regNo) {
        db.remove(regNo);
        return "Student has been deleted successfully";
    }

    public Student updateCourse(int regNo, String course) {
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }

    public Student updateCourseAge(int regNo, Student student) {
        db.get(regNo).setCourse(student.getCourse());
        db.get(regNo).setAge(student.getAge());
        return db.get(regNo);
    }
}
