package com.netcracker.hwapp.dao.mapper;

import com.netcracker.hwapp.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {


    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {

        Student student = new Student();

        student.setStudentId(resultSet.getInt("student_id"));
        student.setFirstName(resultSet.getString("first_name"));
        student.setLastName(resultSet.getString("last_name"));
        student.setCourse(resultSet.getInt("course"));
        student.setDebt(resultSet.getBoolean("debt"));

        return student;
    }
}