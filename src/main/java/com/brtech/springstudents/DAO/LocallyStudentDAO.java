package com.brtech.springstudents.DAO;

import com.brtech.springstudents.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class LocallyStudentDAO {

    private final List<Student> STUDENTS_LIST = new ArrayList<>();

    public List<Student> getStudentsList() {
        return STUDENTS_LIST;
    }

    public Student save(Student student) {
        STUDENTS_LIST.add(student);
        return student;
    }

    public Student update(Student student) {
        var studentIndex = IntStream.range(0, STUDENTS_LIST.size())
                .filter(index -> STUDENTS_LIST.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex > -1) {
            STUDENTS_LIST.set(studentIndex, student);
            return student;
        }
        return null;
    }

    public void delete(String email) {
        if(findByEmail(email) != null){
            STUDENTS_LIST.remove(findByEmail(email));
        }
    }

    public Student findByEmail(String email) {
        return STUDENTS_LIST.stream()
                .filter(s -> email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }
}
