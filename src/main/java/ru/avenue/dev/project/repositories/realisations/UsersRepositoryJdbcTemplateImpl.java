package ru.avenue.dev.project.repositories.realisations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.avenue.dev.project.entities.User;
import ru.avenue.dev.project.repositories.templates.UsersRepository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

@Repository
public class UsersRepositoryJdbcTemplateImpl implements UsersRepository {

    @Autowired
    private JdbcTemplate template;

    //language=SQL
    private final String SQL_GET_USER_BY_ID = "SELECT * FROM account WHERE id = ? LIMIT 1";

    //language=SQL
    private final String SQL_GET_PAGE_OF_USERS = "SELECT * FROM account LIMIT ? OFFSET ?";

    private RowMapper<User> rowMapper = (rs, rowNum) -> User.builder()
            .id(rs.getLong("id"))
            .firstName(rs.getString("first_name"))
            .lastName(rs.getString("last_name"))
            .hashPassword(rs.getString("hash_password"))
            .build();

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
        return template.query(SQL_GET_PAGE_OF_USERS, rowMapper, limit, offset * limit);
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.of(template.queryForObject(SQL_GET_USER_BY_ID, rowMapper, id));
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }
}
