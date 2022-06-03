package ru.avenue.dev.project.services;

import ru.avenue.dev.project.entities.User;

import java.util.List;

public interface UsersService {
    User findById(Long id);
    List<User> findAll(int limit, int offset);
    void deleteUserById(Long id);
    void deleteUser(User user);
    User createNewUser(User user);
    User updateUser(User user);
}
