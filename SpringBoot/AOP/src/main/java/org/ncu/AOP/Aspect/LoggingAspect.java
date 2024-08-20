package org.ncu.AOP.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* org.ncu.AOP.Dao.UserDaoImpl.get*(..))")
    public void beforeUserDaoMethodExecution(JoinPoint joinPoint) {
        System.out.println("Entering method : " + joinPoint.getSignature().getName());
    }
    @After("execution(* org.ncu.AOP.Dao.UserDaoImpl.get*(..))")
    public void afterUserDaoMethodExecution(JoinPoint joinPoint) {
        System.out.println("Exiting method : " + joinPoint.getSignature().getName());
    }
    @AfterThrowing(pointcut = "execution(* org.ncu.AOP.Dao.UserDaoImpl.get*(..))", throwing = "ex")
    public void afterThrowingAdvice(Exception ex) {
        System.out.println("Exception occurred: " + ex.getMessage());
    }
    @AfterReturning(pointcut = "execution(* org.ncu.AOP.Dao.UserDaoImpl.get*(..))", returning = "result")
    public void afterReturningAdvice(Object result) {
        System.out.println("Returning: " + result);
    }
    @Around("execution(* org.ncu.AOP.Dao.UserDaoImpl.get*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before method execution: " + joinPoint.getSignature().getName());
        Object result = joinPoint.proceed();
        System.out.println("After method execution: " + joinPoint.getSignature().getName());
        return result;
    }
}
