package edu.poly.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

    @GetMapping("/customers/hello")
    @ResponseBody
    public String hello(@RequestParam("name") String name) {
        return "Hello, Customer! Welcome " + name;
    }

    @GetMapping("/customers/welcome/{name}")
    @ResponseBody
    public String welcome(@PathVariable String name) {
        return "Hello, Customer! Welcome " + name;
    }

}
