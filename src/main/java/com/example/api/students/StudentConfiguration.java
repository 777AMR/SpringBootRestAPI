package com.example.api.students;

import com.example.api.Student;
import org.hibernate.mapping.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;


@Configuration
public class StudentConfiguration {
    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            studentRepository.save(new Student("George", "alex@gmailcom", LocalDate.of(1990, Month.FEBRUARY, 14)));
        };
    }
}
