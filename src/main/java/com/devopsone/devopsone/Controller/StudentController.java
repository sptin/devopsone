package com.devopsone.devopsone.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<String> getAllStudents(){
        List<String> students = Arrays.asList("Tammy", "Johnson");
        return students;
    }

    @GetMapping("/student/{id}")
    public String getStudent(@RequestParam int id){
        return "ME";
    }
}
