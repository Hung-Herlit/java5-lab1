package edu.poly.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/bai5")
public class Bai5Controller {
    @GetMapping("/chunhat")
    public String tinh() {
        return "demo/chunhat";
    }

    @PostMapping("/chunhat")
    public String tinh(Model model, @RequestParam("chieuDai") Integer chieuDai,
            @RequestParam("chieuRong") Integer chieuRong) {
        Integer dientich = chieuDai * chieuRong;
        model.addAttribute("dientich", dientich);
        Integer chuvi = (chieuDai + chieuRong) * 2;
        model.addAttribute("chuvi", chuvi);
        return "demo/chunhat";
    }

}
