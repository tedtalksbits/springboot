package com.example.springboot.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
        return List.of(

                new Student(
                        123L,
                        "Tedane",
                        "tedaneblake@gmail.com",
                        45,
                        LocalDate.of(1993, 5, 29)
                ),
                new Student(
                        12456L,
                        "Joon",
                        "joon@gmail.com",
                        32,
                        LocalDate.of(1998, 3, 4)
                )
        );
    }
}
