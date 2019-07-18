package bai.javatest3.Exam1.aop;

import bai.javatest3.Exam1.Event.EventPublisher;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InsertAop {
    @Autowired
    private EventPublisher eventPublisher;
    @Pointcut("execution(public *  bai.javatest3.Exam1.Service.InsertFirm(..))")
    public void log(){
    }

    @Before("log()")
    public void publishBeforEvent(){
        eventPublisher.publishBeforEvent();
    }

    @After("log()")
    public void publishAfterEvent(){
        eventPublisher.publishAfterEvent();
    }

}
