package com.bit235.spring_workshops;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("helloMsg", "BIT235 Spring Boot + Thymeleaf tutorial");
		return "hello"; // resolves to hello.html in templates/
	}
	
	@GetMapping("/form")
	public String form(Model model) {
			return "form"; // resolves to hello.html in templates/
	}

	@PostMapping("/submitUser")
	public String handleUser(User user, Model model) {
		model.addAttribute("name", user.getUsername());
		return "result";
	}

}
