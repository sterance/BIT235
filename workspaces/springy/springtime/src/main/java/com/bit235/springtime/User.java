package com.bit235.springtime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @PostMapping("/submitUser")
    public String handleUser(User user, Model model) {
        model.addAttribute("name", user.getUsername());
        return "result";
    }

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }
}
