package com.brtech.springstudents.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {

    @GetMapping("/api/v1/students")
    public List<String> getStudentsList(){
        return List.of("Bekakra Rabah", "Bekakra Sofiane", "Bekakra Mohammed Lamine");
    }

}
