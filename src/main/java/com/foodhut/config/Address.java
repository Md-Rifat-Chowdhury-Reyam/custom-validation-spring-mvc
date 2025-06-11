package com.foodhut.config;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Constraint(validatedBy = ValidatorConfig.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Address {

    public String message() default "your address must be Bangladesh";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
