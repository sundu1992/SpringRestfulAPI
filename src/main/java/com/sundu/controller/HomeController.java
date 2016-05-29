package com.sundu.controller;

import com.sundu.models.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sundu on 5/29/16.
 */

@RestController
public class HomeController {


    @RequestMapping("/")
    public String WelcomePage(){
        return "Welcome to Restful API Services";
    }


    @RequestMapping("/id/{id}")
    public Student getByStudentId(@PathVariable Integer id) {
        Student s = new Student(1,"Sundari",25);
        return s;
    }

    @RequestMapping(value="/student",method=RequestMethod.POST)
    public String postStudentDate(Student s){
        return "Success!";
    }

}
