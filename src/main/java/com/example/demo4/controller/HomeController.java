package com.example.demo4.controller;

import org.springframework.ui.Model;
import com.example.demo4.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Student student = new Student(1, "Nguyễn Văn A");
        model.addAttribute("student", student);
        model.addAttribute("message", "Chào mừng bạn đến với Thymeleaf!");
        return "index";
    }
}

