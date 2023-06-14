package com.brtech.springstudents.Service;

import com.brtech.springstudents.Model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudentsList(){
        return List.of(new Student("Rabah1", "Bekakra", "bekakrarabah@gmailcom", LocalDate.now(), 24),
                new Student("Sofiane", "Bekakra", "sofiane@gmailcom", LocalDate.now(), 35),
                new Student("Mohammed Lamine", "Bekakra", "amine@gmailcom", LocalDate.now(), 32));
    }

}
