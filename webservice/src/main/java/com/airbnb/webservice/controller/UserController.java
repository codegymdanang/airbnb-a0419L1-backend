package com.airbnb.webservice.controller;

import com.airbnb.web.entity.User;
import com.airbnb.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
//@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;



}
