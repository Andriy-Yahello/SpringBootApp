package com.lofongi.DAO;

import com.lofongi.Entity.Student;
import javafx.print.Collation;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lofongi on 28.06.2017.
 */

@Repository
//initiates beans
public class StudentDAO {
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

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(Integer id){
        return this.students.get(id);
    }
    public void removeStudentById(Integer id){
        this.students.remove(id);
    }

    public void updateStudentById(Student student){
        Student s = students.get(student.getId());
    }
}
