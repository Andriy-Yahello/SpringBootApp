package com.lofongi.DAO;

import com.lofongi.Entity.Student;
import javafx.print.Collation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lofongi on 28.06.2017.
 */

@Repository
//initiates beans
@Qualifier("fakeData")
public class FakeStudentDAOImpl implements StudentDAO {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Robert", "acountent"));
                put(2, new Student(2, "Jeff", "worker"));
                put(3, new Student(3, "Simon", "developer"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    @Override
    public Student getStudentById(Integer id){
        return this.students.get(id);
    }
    @Override
    public void removeStudentById(Integer id){
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student){
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(), student);
    }

    @Override
    public void insertStudentToDb(Student student) {
        this.students.put(student.getId(), student);
    }
}
