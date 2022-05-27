package dev.orf1.springaoplearning.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MetricsAspect {
    private final Logger LOGGER = LoggerFactory.getLogger(MetricsAspect.class);

    public MetricsAspect() {
        LOGGER.info("Metrics interception started");
    }

    @Around(value = "dev.orf1.springaoplearning.aspect.JoinPointConfig.benchmarkAnnotation()")
    public Object aroundBenchmarkAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        long s = System.currentTimeMillis();
        Object object = joinPoint.proceed();
        LOGGER.info("Metrics: {} took {} ms", joinPoint, System.currentTimeMillis() - s);
        return object;
    }
}
