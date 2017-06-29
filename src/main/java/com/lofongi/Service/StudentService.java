package com.lofongi.Service;

import com.lofongi.DAO.StudentDAO;
import com.lofongi.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Lofongi on 28.06.2017.
 */
@Service
public class StudentService{
        @Autowired
        private StudentDAO studentDao;

        public Collection<Student> getAllStudents(){
            return this.studentDao.getAllStudents();
        }

    public Student getStudentById(Integer id){
        return studentDao.getStudentById(id);
    }

    public void removeStudentById(Integer id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }
}
