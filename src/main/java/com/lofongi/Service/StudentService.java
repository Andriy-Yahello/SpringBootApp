package com.lofongi.Service;

import com.lofongi.DAO.FakeStudentDAOImpl;
import com.lofongi.DAO.StudentDAO;
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
        //to avoid conflicts with StudentDAO in fakestud and mongo
        @Qualifier("fakeData")
        //Or @Qualifier("mongoData")
        private StudentDAO StudentDao;

        public Collection<Student> getAllStudents(){
            return this.StudentDao.getAllStudents();
        }

    public Student getStudentById(Integer id){
        return StudentDao.getStudentById(id);
    }

    public void removeStudentById(Integer id) {
        this.StudentDao.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.StudentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        //alt + enter
        this.StudentDao.insertStudentToDb(student);
    }
}
