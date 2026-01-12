package edu.poly.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/demo")
    public String demo(Model model) {
        model.addAttribute("message", "Hello world, this is a spring boot application");
        model.addAttribute("title", "Hello spring boot");
        model.addAttribute("name", "hungddv");
        return "demo/demo";
    }
}
