package com.airbnb.web.controller;

import com.airbnb.web.entity.User;
import com.airbnb.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    UserService userService;

    @GetMapping("/register")
    public String createFormRegister(Model model) {
        model.addAttribute("newUser", new User());
        return "/register";
    }

    @PostMapping("/register")
    public String addUser(@ModelAttribute User user, Model model) {
        userService.save(user);
        model.addAttribute("message", "Create user success");
        return "/register";
    }
}
