package co.com.cramirez.constraint.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.com.cramirez.constraint.ExternalIdConstraint;

public class ExternalValidator implements ConstraintValidator<ExternalIdConstraint, Integer> {

	@Override
	public void initialize(ExternalIdConstraint constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
	}
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {

		return null != value && value > 0;
	}

}
