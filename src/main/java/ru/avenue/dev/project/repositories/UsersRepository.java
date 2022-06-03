package ru.avenue.dev.project.repositories;

import ru.avenue.dev.project.entities.User;

import java.util.Optional;

public interface UsersRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
