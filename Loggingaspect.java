package com.example;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Loggingaspect {


    @Before("execution(* com.example.EmployeeService.addEmployee(..))")
    public void logAdd() {
        System.out.println("Logging: Adding employee");
    }

    @Before("execution(* com.example.EmployeeService.displayEmployee(..))")
    public void logDisplay() {
        System.out.println("Logging: Displaying employee");
    }

    @Before("execution(* com.example.EmployeeService.calculateSalary(..))")
    public void logSalary() {
        System.out.println("Logging: Calculating salary");
    }
}
