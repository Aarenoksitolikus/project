package ru.avenue.dev.project.repositories.realisations;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.avenue.dev.project.entities.Role;

@Repository
@Profile("new")
public interface NewRoleRepository extends JpaRepository<Role, Long> {
}
