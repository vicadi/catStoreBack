package com.catstore.servicestore.anotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.catstore.servicestore.validations.NumberStringValidator;

@Documented
@Constraint(validatedBy = NumberStringValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NumberStringConstraint {
	String message() default "Invalid number, must be natural integer";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
