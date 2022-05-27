package dev.orf1.springaoplearning.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MonitorAspect {
    private final Logger LOGGER = LoggerFactory.getLogger(MonitorAspect.class);

    public MonitorAspect() {
        LOGGER.info("Monitor weaving started");
    }

    @Before(value = "dev.orf1.springaoplearning.aspect.Pointcuts.monitorAnnotation()")
    public void aroundMonitorAnnotation(JoinPoint joinPoint) {
        LOGGER.info("Monitor: {} called", joinPoint.getTarget());
    }
}
