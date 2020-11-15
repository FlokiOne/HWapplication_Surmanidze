package com.netcracker.hwapp.dao;

import com.netcracker.hwapp.model.Student;

import java.util.List;

public interface StudentDao {

    List<Student> getAllStudent();

    void addNewStudent(Student student);

    Student getStudent(int id);

    void updateStudent(Student student);

    void deleteStudent(int id);

}
