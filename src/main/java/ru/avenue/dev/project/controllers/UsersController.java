package ru.avenue.dev.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.avenue.dev.project.entities.User;
import ru.avenue.dev.project.services.templates.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public String getUsersPage(Model model) {
        model.addAttribute("user", User.builder()
                .id(1L)
                .firstName("Maxim")
                .lastName("Ivanov")
                .build());
        return "users";
    }

    @PostMapping
    public String servePostRequest() {
        return null;
    }

    @GetMapping("/signup")
    public String getSignUpPage() {
        return usersService.createNewUser(null).toString();
    }
}
