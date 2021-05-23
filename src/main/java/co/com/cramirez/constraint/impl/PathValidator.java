package co.com.cramirez.constraint.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.com.cramirez.constraint.PathConstraint;

public class PathValidator  implements ConstraintValidator<PathConstraint, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return null != value && !value.isEmpty() && value.matches("^[\\\\|/]+[\\w\\-\\\\/]+$");
	}

}
