package com.brtech.springstudents.Service;

import com.brtech.springstudents.DAO.LocallyStudentDAO;
import com.brtech.springstudents.Model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocallyStudentService implements StudentService{

    private final LocallyStudentDAO dao;

    public LocallyStudentService(LocallyStudentDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Student> getStudentsList() {
        return dao.getStudentsList();
    }

    @Override
    public Student save(Student student) {
        return dao.save(student);
    }

    @Override
    public Student update(Student student) {
        return dao.update(student);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }
}
