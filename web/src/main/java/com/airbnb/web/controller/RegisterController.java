package com.airbnb.web.controller;

import com.airbnb.web.entity.User;
import com.airbnb.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    UserService userService;
    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String createFormRegister(Model model) {
        model.addAttribute("newUser", new User());
        return "registerUser";
    }

    @PostMapping("/register")
    public String addUser(@ModelAttribute User user, Model model) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.save(user);
        model.addAttribute("message", "Create user success");
        model.addAttribute("newUser",new User());
        return "registerUser";
    }
}

