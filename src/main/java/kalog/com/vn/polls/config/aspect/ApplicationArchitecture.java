package kalog.com.vn.polls.config.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ApplicationArchitecture {

    @Pointcut("within(kalog.com.vn.polls..*)")
    public void inAllApp() {}
}
