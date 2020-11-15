package com.netcracker.hwapp.controller;

import com.netcracker.hwapp.dao.StudentDao;
import com.netcracker.hwapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentDao studentDao;


    @GetMapping()
    public String index(Model model) {
        List<Student> students = studentDao.getAllStudent();
        model.addAttribute("students", students);

        return "students/student-index";
    }

    @GetMapping("/{studentId}")
    public String show(@PathVariable int studentId, Model model) {
        Student student = studentDao.getStudent(studentId);
        model.addAttribute("student", student);

        return "students/student-show";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("student", new Student());

        return "students/student-create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("student") Student student) {
        studentDao.addNewStudent(student);

        return "redirect:/students";
    }

    @GetMapping("/edit/{studentId}")
    public String edit(@PathVariable int studentId, Model model) {
        Student student = studentDao.getStudent(studentId);
        model.addAttribute("student", student);

        return "students/student-edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("student") Student student) {
        studentDao.updateStudent(student);

        return "redirect:/students";
    }

    @GetMapping("/delete/{studentId}")
    public String delete(@PathVariable int studentId) {
        studentDao.deleteStudent(studentId);

        return "redirect:/students";
    }


}

