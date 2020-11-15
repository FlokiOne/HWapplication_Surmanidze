package com.netcracker.hwapp.dao;

import com.netcracker.hwapp.dao.mapper.StudentMapper;
import com.netcracker.hwapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Student> getAllStudent() {
        String SQL = "SELECT * FROM student";
        List<Student> students = jdbcTemplate.query(SQL, new StudentMapper());

        return students;
    }

    @Override
    public void addNewStudent(Student student) {
        String SQL = "INSERT INTO student(first_name, last_name, course) VALUES (?, ?, ?)";

        jdbcTemplate.update(SQL,
                student.getFirstName(),
                student.getLastName(),
                student.getCourse());
    }

    @Override
    public Student getStudent(int id) {
        String SQL = "SELECT * FROM student WHERE student_id = ?";

        return jdbcTemplate.queryForObject(SQL, new Object[]{id}, new StudentMapper());
    }

    @Override
    public void updateStudent(Student student) {
        String SQL = "UPDATE student SET first_name = ?, last_name = ?, course = ?, debt = ? WHERE student_id = ?";

        jdbcTemplate.update(SQL,
                student.getFirstName(),
                student.getLastName(),
                student.getCourse(),
                student.getDebt(),
                student.getStudentId());

    }

    @Override
    public void deleteStudent(int id) {
        String SQL = "DELETE FROM student WHERE student_id = ?";

        jdbcTemplate.update(SQL, id);
    }
}