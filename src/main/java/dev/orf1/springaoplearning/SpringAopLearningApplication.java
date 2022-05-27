package dev.orf1.springaoplearning;

import dev.orf1.springaoplearning.business.Business1;
import dev.orf1.springaoplearning.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopLearningApplication implements CommandLineRunner {
    private final Logger LOGGER = LoggerFactory.getLogger(SpringAopLearningApplication.class);

    Business1 business1;
    Business2 business2;

    @Autowired
    public SpringAopLearningApplication(Business1 business1, Business2 business2) {
        this.business1 = business1;
        this.business2 = business2;
    }

    @Override
    public void run(String... args) {
        LOGGER.info(business1.calculateSomething());
        LOGGER.info(business2.calculateSomething());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAopLearningApplication.class, args);
    }
}
