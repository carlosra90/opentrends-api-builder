package co.com.cramirez.constraint;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import co.com.cramirez.constraint.impl.AlphabeticValidator;

@Documented
@Constraint(validatedBy = AlphabeticValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface AlphabeticConstraint {
    String message() default "Err02 Invalid Name String, the name must have only Alphabetic characters";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
