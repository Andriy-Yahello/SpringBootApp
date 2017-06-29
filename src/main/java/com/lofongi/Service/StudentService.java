package com.lofongi.Service;

import com.lofongi.DAO.FakeStudentDAOImpl;
import com.lofongi.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Lofongi on 28.06.2017.
 */
@Service
public class StudentService{
        @Autowired
        @Qualifier("fakeData")
        private FakeStudentDAOImpl fakeStudentDaoImpl;

        public Collection<Student> getAllStudents(){
            return this.fakeStudentDaoImpl.getAllStudents();
        }

    public Student getStudentById(Integer id){
        return fakeStudentDaoImpl.getStudentById(id);
    }

    public void removeStudentById(Integer id) {
        this.fakeStudentDaoImpl.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.fakeStudentDaoImpl.updateStudent(student);
    }

    public void insertStudent(Student student) {
        //alt + enter
        this.fakeStudentDaoImpl.insertStudentToDb(student);
    }
}
