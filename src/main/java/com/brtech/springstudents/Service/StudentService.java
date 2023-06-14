package com.brtech.springstudents.Service;

import com.brtech.springstudents.Model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {
    List<Student> getStudentsList();

    Student save(Student student);

    Student update(Student student);

    void delete(String email);

    Student findByEmail(String email);

}
