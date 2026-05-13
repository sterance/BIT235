// Chris Smith - S1564427

// defines the package
package com.bit235.wiki.controller;

// imports
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bit235.wiki.service.NavigationService;

// controller class handles navigation requests
@Controller
public class NavigationController {

    private final NavigationService navigationService;

    // constructs the service
    public NavigationController(NavigationService navigationService) {
        this.navigationService = navigationService;
    }

    // maps root and /home urls to index.html
    @GetMapping({"/", "/home"})
    public String home(Model model) {
        return renderPage("home", model);
    }

    // maps /articles url to index.html
    @GetMapping("/articles")
    public String articles(Model model) {
        return renderPage("articles", model);
    }

    // maps /categories url to index.html
    @GetMapping("/categories")
    public String categories(Model model) {
        return renderPage("categories", model);
    }

    private String renderPage(String page, Model model) {
        model.addAttribute("contentTemplate", navigationService.resolveTemplate(page));
        return "index";
    }
}
