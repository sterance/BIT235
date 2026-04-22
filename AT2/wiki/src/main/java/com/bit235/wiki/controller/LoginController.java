// Chris Smith - S1564427

package com.bit235.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit235.wiki.service.LoginService;

// controller class handles login requests
@Controller
public class LoginController {

    private final LoginService loginService;

    // constructs the service
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    // maps root url to index.html
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // maps /login url to login result 
    @PostMapping("/login")
    // passes in model object
    public String login(@RequestParam String username, @RequestParam String password, Model model) {

        // uses login service to validate username and password
        if (loginService.validateUser(username, password)) {
            // happy path: adds valid user message to model object, renders success view
            model.addAttribute("message", loginService.getWelcomeMessage(username));
            return "success";
        } else {
            // sad path: adds error to model object, renders error view
            model.addAttribute("error", "Invalid username or password");
            return "error";
        }
    }
}
