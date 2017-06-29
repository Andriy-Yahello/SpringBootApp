package com.lofongi.Controller;

import com.lofongi.Entity.Student;
import com.lofongi.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)

    public void deleteStudentById(@RequestBody Student student){
        //alt + enter creates a method
        studentsrvice.updateStudent(student);
    }

}
