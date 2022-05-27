package dev.orf1.springaoplearning.data;

import dev.orf1.springaoplearning.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TagJdbcDao {

    JdbcTemplate jdbcTemplate;

    @Autowired
    public TagJdbcDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Tag> findAll() {
        return jdbcTemplate.query("SELECT * FROM tag_registered", new BeanPropertyRowMapper<>(Tag.class));

    }
}
