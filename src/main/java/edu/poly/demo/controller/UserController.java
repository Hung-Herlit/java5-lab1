package edu.poly.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import edu.poly.demo.service.CompanyService;
import edu.poly.demo.service.UserService;

@Controller
public class UserController {
    @Autowired
    private CompanyService companyService;

    @Autowired
    private UserService userService;

    UserController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/user")
    @ResponseBody
    public String getUser() {
        return userService.getUserInfo();
    }

    @GetMapping("/company")
    @ResponseBody
    public String getCompany() {
        return companyService.getCompanyInfo();
    }
}
