package co.com.cramirez.constraint;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import co.com.cramirez.constraint.impl.ExternalValidator;

@Documented
@Constraint(validatedBy = ExternalValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExternalIdConstraint {

    String message() default "ERR01 Invalid External Id, the number must be major to zero";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
