package dev.orf1.springaoplearning.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfig {
    @Pointcut("@annotation(dev.orf1.springaoplearning.aspect.Benchmark)")
    public void benchmarkAnnotation(){}
}
