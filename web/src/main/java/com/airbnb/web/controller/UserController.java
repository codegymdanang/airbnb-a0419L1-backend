package com.airbnb.web.controller;

import com.airbnb.web.convert.UserConveter;
import com.airbnb.web.entity.User;
import com.airbnb.web.request.UserRequest;
import com.airbnb.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/create")
    public ModelAndView showFormCreate() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("user",new UserRequest());
        return  modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView addUser(@ModelAttribute UserRequest userRequest) {
        User user = UserConveter.convertRequestToEntity(userRequest);
        userService.save(user);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("user",new UserRequest());
        modelAndView.addObject("message","create successfully");
        return modelAndView;
    }

    @GetMapping("/login")
    public ModelAndView showLoginForm(){
        ModelAndView modelAndView = new ModelAndView("/login");
        modelAndView.addObject("user",new UserRequest());
        return  modelAndView;
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute UserRequest userRequest, Pageable pageable, Model model){
        Page<User> userList = userService.findAll(pageable);

        for (User user:userList) {
            if(user.getUserName().equals(userRequest.getUserName())&&user.getPassword().equals(userRequest.getPassword())){
                return "create";
            }
        }
        return "redirect:/";
    }

}
