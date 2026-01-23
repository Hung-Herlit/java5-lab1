package edu.poly.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @RequestMapping("/search")
    public String search(){
        return "employees/search";
    }
}
