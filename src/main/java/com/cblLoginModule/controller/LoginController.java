package com.cblLoginModule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cblLoginModule.service.AuthenticationService;

@Controller
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/")
    public String redirectToLogin() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model) {
        String result = authenticationService.authenticate(username, password);

        if ("success".equals(result)) {
            model.addAttribute("username", username);
            return "success";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }

    @PostMapping("/register")
    public String register(String newUsername, String newPassword, Model model) {
        try {
            // Check if the username already exists
            if (authenticationService.userExists(newUsername)) {
                model.addAttribute("error", "Username already exists");
                return "login";
            }

            // Create a new user
            authenticationService.registerUser(newUsername, newPassword);

            // Automatically log in the newly registered user
            model.addAttribute("username", newUsername);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", "Registration failed. Please try again.");
            return "login";
        }
    }


    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register";
    }
}
