package ru.avenue.dev.project.repositories.realisations;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.avenue.dev.project.entities.Role;

import java.util.List;

@Repository
@Profile("jpa")
public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findAllByNameEndsWith(String endOfName);
}
