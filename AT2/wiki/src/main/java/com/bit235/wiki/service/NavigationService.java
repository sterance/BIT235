// Chris Smith - S1564427

// defines the package
package com.bit235.wiki.service;

// imports
import org.springframework.stereotype.Service;

// Service class handles navigation view selection
@Service
public class NavigationService {

    // returns the template name for the requested page
    public String resolveTemplate(String page) {
        if (page == null || page.isBlank() || "home".equalsIgnoreCase(page)) {
            return "home";
        }

        return switch (page.toLowerCase()) {
            case "articles" -> "articles";
            case "categories" -> "categories";
            default -> "home";
        };
    }
}
