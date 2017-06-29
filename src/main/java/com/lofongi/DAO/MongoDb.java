package com.lofongi.DAO;

import com.lofongi.Entity.Student;
import com.sun.corba.se.pept.transport.Connection;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Lofongi on 29.06.2017.
 */

@Repository
@Qualifier("mongoData")
//just change in studentService
public class MongoDb implements StudentDAO {

    Connection mongoConnection;

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1, "Ben", "computer science"));
            }
        };
    }

    @Override
    public Student getStudentById(Integer id) {
        return null;
    }

    @Override
    public void removeStudentById(Integer id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDb(Student student) {

    }
}
