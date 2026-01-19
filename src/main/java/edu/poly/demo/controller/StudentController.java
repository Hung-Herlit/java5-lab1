package edu.poly.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import edu.poly.demo.entity.Student;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("student", new Student());
        return "students/create";
    }

    @PostMapping("create")
    public String create(Model model, @Valid Student student, BindingResult result) {
        if (result.hasErrors()) {
            return "students/create";
        } else {
            System.out.println("Valid student: " + student);
        }
        model.addAttribute("student", student);
        model.addAttribute("message", "Student created successfully!" + student.getId());
        return "students/create";
    }

}