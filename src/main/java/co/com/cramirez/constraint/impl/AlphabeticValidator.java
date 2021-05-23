package co.com.cramirez.constraint.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.com.cramirez.constraint.AlphabeticConstraint;

public class AlphabeticValidator implements ConstraintValidator<AlphabeticConstraint,String> {

	@Override
	public void initialize(AlphabeticConstraint constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
	}	
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		return !value.isEmpty() && value.matches("^[a-zA-z]+$");
	}

}
