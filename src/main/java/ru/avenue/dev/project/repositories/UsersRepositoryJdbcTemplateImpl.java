package ru.avenue.dev.project.repositories;

import org.springframework.stereotype.Repository;
import ru.avenue.dev.project.entities.User;

import java.util.List;
import java.util.Optional;

@Repository
public class UsersRepositoryJdbcTemplateImpl implements UsersRepository {
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<User> findAll(int limit, int offset) {
        return null;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }
}
