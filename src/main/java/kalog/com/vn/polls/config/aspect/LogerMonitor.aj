package kalog.com.vn.polls.config.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogerMonitor {

    @Before("ApplicationArchitecture.inAllApp()")
    public void log(JoinPoint joinPoint) {
        return;
    }
}
