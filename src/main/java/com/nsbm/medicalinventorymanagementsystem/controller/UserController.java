package com.nsbm.medicalinventorymanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/Login")
    public String Login(Model model) {
        return "/User/Login";
    }

    @GetMapping("/Register")
    public String Register(Model model) {
        return "/User/Register";
    }
}
