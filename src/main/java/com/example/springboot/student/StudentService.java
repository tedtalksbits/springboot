package com.example.springboot.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
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
                ),
                new Student(
                        124333L,
                        "Eddy",
                        "elittlefield0@sciencedaily.com",
                        61,
                        LocalDate.of(2022, 2, 4)
                ),
                new Student(
                        2233L,
                        "Alfred",
                        "averecker1@tinyurl.com",
                        90,
                        LocalDate.of(2021, 12, 26)),
                new Student(
                        3233L,
                        "Ronda",
                        "rjudson2@icq.com",
                        82,
                        LocalDate.of(2022, 3, 10)),
                new Student(
                        4233L,
                        "Dorian",
                        "dfanstone3@zimbio.com",
                        15,
                        LocalDate.of(2022, 1, 18)),
                new Student(
                        5233L,
                        "Glynnis",
                        "gcastrillo4@java.com",
                        91,
                        LocalDate.of(2021, 12, 28)),
                new Student(
                        6233L,
                        "Brenden",
                        "bboodle5@addtoany.com",
                        89,
                        LocalDate.of(2021, 12, 4)),
                new Student(
                        7233L,
                        "Nap",
                        "nroake6@archive.org",
                        55,
                        LocalDate.of(2021, 11, 27)),
                new Student(
                        8233L,
                        "Kissiah",
                        "kmcwhirter7@pbs.org",
                        37,
                        LocalDate.of(2022, 3, 15)),
                new Student(
                        9233L,
                        "Helene",
                        "habramowitch8@biglobe.ne.jp",
                        12,
                        LocalDate.of(2021, 7, 3)),
                new Student(
                        10L,
                        "Jeanelle",
                        "jrosberg9@wufoo.com",
                        57,
                        LocalDate.of(2021, 7, 19))
        );
    }
}
