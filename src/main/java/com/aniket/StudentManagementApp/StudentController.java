package com.aniket.StudentManagementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
        return studentService.getStudent(regNo);
    }

    @GetMapping("/getByPath/{id}")
    public Student getStudentUsingPath(@PathVariable("id") int regNo){
        return studentService.getStudent(regNo);
    }

    @PutMapping("/updateAge")
    public Student updateAge(@RequestParam("id") int regNo, @RequestParam("age") int age){
        return studentService.updateAge(regNo, age);
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam("id") int regNo){
        return studentService.deleteStudent(regNo);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentUsingPath(@PathVariable("id") int regNo){
        return studentService.deleteStudent(regNo);
    }

    @PutMapping("/updateCourse")
    public Student updateCourse(@RequestParam("id") int regNo, @RequestParam("course") String course){
        return studentService.updateCourse(regNo, course);
    }

    @PutMapping("/updateCourse/{id}/{course}")
    public Student updateCourseUsingPath(@PathVariable("id") int regNo, @PathVariable("course") String course){
        return studentService.updateCourse(regNo, course);
    }

    @PutMapping("/updateCourse/{course}")
    public Student updateCourseUsingBoth(@RequestParam("id")int regNo, @PathVariable("course") String course){
        return studentService.updateCourse(regNo, course);
    }

    @PutMapping("/updateCourseAge")
    public Student updateCourseAge(@RequestParam("id") int regNo, @RequestBody Student student){
        return studentService.updateCourseAge(regNo, student);
    }
}
