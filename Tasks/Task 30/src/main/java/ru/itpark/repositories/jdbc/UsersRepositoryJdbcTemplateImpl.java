package ru.itpark.repositories.jdbc;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itpark.models.User;
import ru.itpark.repositories.UsersRepository;

import java.util.List;
import java.util.Optional;

public class UsersRepositoryJdbcTemplateImpl implements UsersRepository {
    //language=SQL
    private final static String SQL_SELECT_BY_ID = "select * from service_user where id = ?";

    //language=SQL
    private final static String SQL_SELECT_BY_LOGIN = "select * from service_user where login = ?";

    //language=SQL
    private final static String SQL_SELECT_ALL_BY_FIRST_NAME_AND_LAST_NAME = "select * from service_user " +
            "where first_name = ? and last_name = ?";

    //language=SQL
    private final static String SQL_SELECT_ALL = "select * from service_user";

    //language=SQL
    private final static String SQL_INSERT = "insert into service_user(first_name, last_name, login, password_hash) " +
            "values (?, ?, ?, ?)";

    //language=SQL
    private final static String SQL_INSERT_COOKIE = "insert into user_auth(user_id, cookie_value) " +
            "values (?, ?)";

    private JdbcTemplate jdbcTemplate;

    private RowMapper<User> usersRowMapper = (row, rowNumber) ->
            User.builder().id(row.getLong("id"))
                    .firstName(row.getString("first_name"))
                    .lastName(row.getString("last_name"))
                    .login(row.getString("login"))
                    .passwordHash(row.getString("password_hash"))
                    .build();

//    private UsersRowMapper usersRowMapper;

//    public UsersRepositoryJdbcTemplateImpl(DataSource dataSource) {
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
//    }

    public UsersRepositoryJdbcTemplateImpl(JdbcTemplate template) {
        this.jdbcTemplate = template;
    }

    @Override
    public void save(User model) {
        jdbcTemplate.update(SQL_INSERT, model.getFirstName(), model.getLastName(), model.getLogin(),
                model.getPasswordHash());
    }

    @Override
    public User find(Long id) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID, usersRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL, usersRowMapper);
    }


    @Override
    public Optional<User> findOneByLogin(String login) {
        try {
            return Optional.of(jdbcTemplate.queryForObject(SQL_SELECT_BY_LOGIN, usersRowMapper, login));
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    @Override
    public List<User> findAllByFirstNameAndLastName(String firstName, String lastName) {
        return jdbcTemplate.query(SQL_SELECT_ALL_BY_FIRST_NAME_AND_LAST_NAME, usersRowMapper, firstName, lastName);
    }

    @Override
    public void saveCookieValue(Long id, Optional<String> cookieValue) {
        jdbcTemplate.update(SQL_INSERT_COOKIE, id, cookieValue);
    }
}
