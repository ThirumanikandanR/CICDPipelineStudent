package com.dummy.StudentDemoClass.service;

import com.dummy.StudentDemoClass.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>();
  public void addStudentDetails() {
        students = List.of(
                new Student(1, "Krishna", "10"),
                new Student(2, "Thiru", "11"),
                new Student(3, "Arun", "12")
        );
    }


    public Student findById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == (id)) {
                return students.get(i);
            }
        }
        return null;
    }

    public List<Student> findAllStudent() {
        addStudentDetails();
        return students;
    }


}
