package com.brtech.springstudents.Controller;

import com.brtech.springstudents.Model.Student;
import com.brtech.springstudents.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/api/v1/students")
    public List<Student> getStudentsList(){
        return studentService.getStudentsList();
    }

}
