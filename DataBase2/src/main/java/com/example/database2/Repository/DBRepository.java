package com.example.database2.Repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
@Repository
public class DBRepository {
    private final JdbcTemplate jdbcTemplate;
    public DBRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public User findById(Long id) {
        return jdbcTemplate.queryForObject(
                "SELECT id, name, age FROM users WHERE id = ?",
                (ResultSet rs, int rowNum) -> {
                    User u = new User();
                    u.setId(rs.getLong("id"));
                    u.setName(rs.getString("name"));
                    u.setAge(rs.getInt("Age"));
                    return u;
                },
                id);
    }

    public Integer save(User user) {
        return jdbcTemplate.update(
                "INSERT INTO users (name, age) VALUES (?, ?)",
                user.getName(), user.getAge());
    }
}
