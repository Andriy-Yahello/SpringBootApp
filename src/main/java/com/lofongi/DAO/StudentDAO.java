package com.lofongi.DAO;

import com.lofongi.Entity.Student;

import java.util.Collection;

/**
 * Created by Lofongi on 29.06.2017.
 */
public interface StudentDAO {
    Collection<Student> getAllStudents();

    Student getStudentById(Integer id);

    void removeStudentById(Integer id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
