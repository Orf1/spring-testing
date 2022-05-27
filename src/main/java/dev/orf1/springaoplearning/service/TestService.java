package dev.orf1.springaoplearning.service;

import dev.orf1.springaoplearning.aspect.Benchmark;
import dev.orf1.springaoplearning.aspect.Monitor;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Monitor
    @Benchmark
    public String getTestValue() {
        return "secret test value";
    }
}
