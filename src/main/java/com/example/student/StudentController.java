package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by shubhamutwal on 11/09/16.
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Student create(@RequestBody Student student) {
        Student result = studentRepository.save(student);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value="/{employeeId}")
    public Student get(@PathVariable String employeeId){
        return studentRepository.findOne(employeeId);
    }
}