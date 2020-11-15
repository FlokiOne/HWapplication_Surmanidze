package com.netcracker.hwapp.model;

import lombok.Data;

@Data
public class Student {

    private Integer studentId;
    private String firstName;
    private String lastName;
    private Integer course;
    private Boolean debt;

    public Student () {}

    public Student (Integer studentId, String firstName, String lastName, Integer course, Boolean debt) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.debt = debt;
    }

    public Student (String firstName, String lastName, Integer course, Boolean debt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.debt = debt;
    }

}