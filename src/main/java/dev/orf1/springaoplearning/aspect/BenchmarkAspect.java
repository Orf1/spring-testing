package dev.orf1.springaoplearning.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BenchmarkAspect {
    private final Logger LOGGER = LoggerFactory.getLogger(BenchmarkAspect.class);

    public BenchmarkAspect() {
        LOGGER.info("Benchmark weaving started");
    }

    @Around(value = "dev.orf1.springaoplearning.aspect.Pointcuts.benchmarkAnnotation()")
    public Object aroundBenchmarkAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        long s = System.currentTimeMillis();
        Object object = joinPoint.proceed();
        LOGGER.info("Metrics: {} took {} ms", joinPoint.getTarget(), System.currentTimeMillis() - s);
        return object;
    }
}
