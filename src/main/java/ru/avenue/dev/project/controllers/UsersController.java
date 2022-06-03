package ru.avenue.dev.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.avenue.dev.project.services.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public String getUsersPage() {
        return null;
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
