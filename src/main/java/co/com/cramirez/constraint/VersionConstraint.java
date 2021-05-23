package co.com.cramirez.constraint;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import co.com.cramirez.constraint.impl.VersionValidator;

@Documented
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@Constraint(validatedBy = VersionValidator.class)
public @interface VersionConstraint {
	String message() default "Err04 Invalid Version Number, it must have n.n.n pattern";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
