package me.c10s.employeestrategy.annotation;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Service
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface VacationHandlerType {

}
