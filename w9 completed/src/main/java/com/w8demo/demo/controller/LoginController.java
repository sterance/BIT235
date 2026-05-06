package com.w8demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.w8demo.demo.model.Person;
import com.w8demo.demo.service.PersonService;

@Controller
public class LoginController {

    private final PersonService personService;

    public LoginController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping({ "/", "/login" })  // default home page (just providing domain name) and login both open login.html
    public String showLoginForm() {
        return "login.html";
    }

@PostMapping("/submitUser")
public String submitUser(@RequestParam String username,
                         @RequestParam String password,
                         Model model) {

    Person person = personService.findByUsernameAndPassword(username, password);

    if (person != null) {
        model.addAttribute("person", person);
        model.addAttribute("messageType", "success");
    } else {
        model.addAttribute("message", "Invalid username or password.");
        model.addAttribute("messageType", "error");
    }

    return "login";
}


}
