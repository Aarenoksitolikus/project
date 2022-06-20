package ru.avenue.dev.project.services.templates;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.avenue.dev.project.entities.User;

import java.util.List;

public interface UsersService extends UserDetailsService {
    User findById(Long id);
    List<User> findAll(int limit, int offset);
    void deleteUserById(Long id);
    void deleteUser(User user);
    User createNewUser(User user);
    User updateUser(User user);
    User findByEmail(String email);
}
