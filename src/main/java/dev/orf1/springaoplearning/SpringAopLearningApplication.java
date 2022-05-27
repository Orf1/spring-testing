package dev.orf1.springaoplearning;

import dev.orf1.springaoplearning.data.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopLearningApplication implements CommandLineRunner {
    private final Logger LOGGER = LoggerFactory.getLogger(SpringAopLearningApplication.class);
    private final PersonJdbcDAO personJdbcDAO;

    @Autowired
    public SpringAopLearningApplication(PersonJdbcDAO personJdbcDAO) {
        this.personJdbcDAO = personJdbcDAO;
    }

    @Override
    public void run(String... args) {
        LOGGER.info("Listening on {}", "http://127.0.0.1:8080");
        LOGGER.info("H2 Console running on {}", "http://127.0.0.1:8080/h2-console");
        LOGGER.info("Find-all: {}", personJdbcDAO.findAll());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAopLearningApplication.class, args);
    }
}
