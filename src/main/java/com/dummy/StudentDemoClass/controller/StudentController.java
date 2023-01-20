package com.dummy.StudentDemoClass.controller;

import com.dummy.StudentDemoClass.entity.Student;
import com.dummy.StudentDemoClass.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.findById(id);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        // TODO Auto-generated method stub
        return studentService.findAllStudent();
    }
}

