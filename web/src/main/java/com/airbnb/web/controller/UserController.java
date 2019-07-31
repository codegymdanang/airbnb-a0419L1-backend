package com.airbnb.web.controller;

import com.airbnb.web.convert.UserConveter;
import com.airbnb.web.entity.User;
import com.airbnb.web.request.UserRequest;
import com.airbnb.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    UserService userService;

//    @GetMapping("/create")
//    public ModelAndView showFormCreate() {
//        ModelAndView modelAndView = new ModelAndView("/create");
//        modelAndView.addObject("user",new UserRequest());
//        return  modelAndView;
//    }
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<Void> createCustomer(@RequestBody UserRequest userRequest, UriComponentsBuilder ucBuilder) {
        User user = UserConveter.convertRequestToEntity(userRequest);
        userService.save(user);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PutMapping(value = "/user/edit/{id}")
    public ResponseEntity<User> suaNguoiDung(@PathVariable long id, @RequestBody UserRequest userRequest){
        Optional<User> user = userService.findById(id);

        if (user == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        userService.remove(id);
        User newUser = new User();
        newUser.setId(id);
        newUser.setFullName(userRequest.getFullName());
        newUser.setUserName(userRequest.getUserName());
        newUser.setPassword(userRequest.getPassword());
        newUser.setPhoneNumber(userRequest.getPhoneNumber());
//        newUser.getGender(userRequest.getGender());


        userService.save(newUser);
        return new ResponseEntity<>(newUser, HttpStatus.OK);

    }
//    @PostMapping("/create")
//    public ModelAndView addUser(@ModelAttribute UserRequest userRequest) {
//        User user = UserConveter.convertRequestToEntity(userRequest);
//        userService.save(user);
//        ModelAndView modelAndView = new ModelAndView("/create");
//        modelAndView.addObject("user",new UserRequest());
//        modelAndView.addObject("message","create successfully");
//        return modelAndView;
//    }
//
//    @GetMapping("/login")
//    public ModelAndView showLoginForm(){
//        ModelAndView modelAndView = new ModelAndView("/login");
//        modelAndView.addObject("user",new UserRequest());
//        return  modelAndView;
//    }
//
//    @PostMapping("/login")
//    public String loginUser(@ModelAttribute UserRequest userRequest, Pageable pageable, Model model){
//        Page<User> userList = userService.findAll(pageable);
//
//        for (User user:userList) {
//            if(user.getUserName().equals(userRequest.getUserName())&&user.getPassword().equals(userRequest.getPassword())){
//                return "create";
//            }
//        }
//        return "redirect:/";
//    }

}
