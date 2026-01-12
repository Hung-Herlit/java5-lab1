package edu.poly.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/customers")
public class RegisterController {

    @GetMapping("/register")
    public String register() {
        return "security/register";
    }

    @PostMapping("/register")
    public String register(Model model, @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("confirmPassword") String confirmPassword) {

        model.addAttribute("username", username);
        model.addAttribute("password", password);
        model.addAttribute("confirmPassword", confirmPassword);

        return "security/register";
    }

}
