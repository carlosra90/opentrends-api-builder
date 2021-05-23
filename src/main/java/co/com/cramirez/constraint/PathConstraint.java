package co.com.cramirez.constraint;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import co.com.cramirez.constraint.impl.PathValidator;

@Documented
@Constraint(validatedBy = PathValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PathConstraint {
	String message() default "Err03 Invalid Route Path String, the path must start with slash or backslash with non whitespace";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
