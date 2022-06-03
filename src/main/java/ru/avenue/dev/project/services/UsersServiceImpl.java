package ru.avenue.dev.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.avenue.dev.project.entities.User;
import ru.avenue.dev.project.repositories.UsersRepository;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public User findById(Long id) {
        if (usersRepository.findById(id).isPresent()) {
            return usersRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<User> findAll(int limit, int offset) {
        return null;
    }

    @Override
    public void deleteUserById(Long id) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public User createNewUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
