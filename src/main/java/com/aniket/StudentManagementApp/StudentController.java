package com.aniket.StudentManagementApp;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<Integer, Student> db = new HashMap<>();

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        db.put(student.getRegNo(), student);
        return "Student has been added successfully";
    }

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
        return db.get(regNo);
    }

    @GetMapping("/getByPath/{id}")
    public Student getStudentUsingPath(@PathVariable("id") int regNo){
        return db.get(regNo);
    }

    @PutMapping("/update-age")
    public Student updateAge(@RequestParam("id") int regNo, @RequestParam("age") int age){
        db.get(regNo).setAge(age);
        return db.get(regNo);
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam("id") int regNo){
        db.remove(regNo);
        return "Student has been deleted successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentUsingPath(@PathVariable("id") int regNo){
        db.remove(regNo);
        return "Student has been deleted successfully";
    }

    @PutMapping("/updateCourse")
    public Student updateCourse(@RequestParam("id") int regNo, @RequestParam("course") String course){
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }

    @PutMapping("/updateCourse/{id}/{course}")
    public Student updateCourseUsingPath(@PathVariable("id") int regNo, @PathVariable("course") String course){
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }

    @PutMapping("/updateCourse/{course}")
    public Student updateCourseUsingBoth(@RequestParam("id")int regNo, @PathVariable("course") String course){
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }

    @PutMapping("/updateCourseAge")
    public Student updateCourseAge(@RequestParam("id") int regNo, @RequestBody Student student){
        db.get(regNo).setCourse(student.getCourse());
        db.get(regNo).setAge(student.getAge());
        return db.get(regNo);
    }
}
