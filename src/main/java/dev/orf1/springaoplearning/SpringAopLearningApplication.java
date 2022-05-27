package dev.orf1.springaoplearning;

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
    private final TestService testService;

    @Autowired
    public SpringAopLearningApplication(TestService testService) {
        this.testService = testService;
    }

    @Override
    public void run(String... args) {
        LOGGER.info("Test service output: {}", testService.getTestValue());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAopLearningApplication.class, args);
    }
}
