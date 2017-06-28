package com.lofongi.Controller;

import com.lofongi.Entity.Student;
import com.lofongi.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by Lofongi on 28.06.2017.
 */
@RestController
//endpoint
@RequestMapping("/students")
public class StudentController {
    @Autowired
    //spring will instantiate bean of type StudentService
    private StudentService studentsrvice;
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentsrvice.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    //to get id from url
    public Student getStudentById(@PathVariable("id") Integer id){
        return studentsrvice.getStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") Integer id){
        //alt + enter creates a method
         studentsrvice.removeStudentById(id);
    }
}
