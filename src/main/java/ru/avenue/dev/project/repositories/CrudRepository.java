package ru.avenue.dev.project.repositories;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T, ID> {
    T save(T t);
    T update(T t);
    void delete(T t);
    void deleteById(ID id);
    List<T> findAll(int limit, int offset);
    Optional<T> findById(ID id);
}
