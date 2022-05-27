package dev.orf1.springaoplearning.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("@annotation(dev.orf1.springaoplearning.aspect.Benchmark)")
    public void benchmarkAnnotation(){}

    @Pointcut("@annotation(dev.orf1.springaoplearning.aspect.Monitor)")
    public void monitorAnnotation(){}
}
