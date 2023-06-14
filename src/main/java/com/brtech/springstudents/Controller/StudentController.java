package com.brtech.springstudents.Controller;

import com.brtech.springstudents.Model.Student;
import com.brtech.springstudents.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Student> getStudentsList(){
        return service.getStudentsList();
    }

    @PostMapping
    public Student save(@RequestBody Student student){
        return service.save(student);
    }
    @PutMapping
    public Student update(@RequestBody Student student){
        return service.update(student);
    }
    @DeleteMapping("/{email}")
    public void delete(@PathVariable("email") String email){
        service.delete(email);
    }
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email){
        return service.findByEmail(email);
    }

}
