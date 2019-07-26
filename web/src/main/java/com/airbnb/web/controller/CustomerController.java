package com.airbnb.web.controller;

import com.airbnb.web.model.Customer;
import com.airbnb.web.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Customer customer, Model model) {
        customerService.save(customer);
        model.addAttribute("message","Create customer success");
        return "create";
    }
}
