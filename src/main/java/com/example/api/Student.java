package com.example.api;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id;

    private String Name;

    @Column(unique = true)
    private String email;
    private LocalDate dob;

    public Student() {
    }

    public Student(String name, String email, LocalDate dob) {
        Name = name;
        this.email = email;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}
