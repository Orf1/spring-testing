package dev.orf1.springaoplearning;

import dev.orf1.springaoplearning.data.TagJdbcDao;
import dev.orf1.springaoplearning.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopLearningApplication implements CommandLineRunner {
    private final Logger LOGGER = LoggerFactory.getLogger(SpringAopLearningApplication.class);
    private final TagJdbcDao tagJdbcDao;

    @Autowired
    public SpringAopLearningApplication(TagJdbcDao tagJdbcDao) {
        this.tagJdbcDao = tagJdbcDao;
    }

    @Override
    public void run(String... args) {
        LOGGER.info("Listening on {}", "http://127.0.0.1:8080");
        LOGGER.info("H2 Console running on {}", "http://127.0.0.1:8080/h2-console");
        LOGGER.info("Find-all: {}", tagJdbcDao.findAll());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAopLearningApplication.class, args);
    }
}
