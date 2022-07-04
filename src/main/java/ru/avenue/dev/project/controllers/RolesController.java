package ru.avenue.dev.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.avenue.dev.project.entities.Role;
import ru.avenue.dev.project.repositories.realisations.RoleRepository;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RolesController {

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping
    public String getRoles(Model model) {
        model.addAttribute("roles", roleRepository.findAllByNameEndsWith("IN"));
        return "roles";
    }
}
