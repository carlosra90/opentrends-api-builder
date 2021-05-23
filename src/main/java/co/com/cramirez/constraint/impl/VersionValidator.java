package co.com.cramirez.constraint.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.com.cramirez.constraint.VersionConstraint;

public class VersionValidator implements ConstraintValidator<VersionConstraint, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return null != value && !value.isEmpty() && value.matches("^[0-9]{1,10}([.][0-9]{1,10})([.][0-9\\-\\w]{1,40})?$");
	}

}
