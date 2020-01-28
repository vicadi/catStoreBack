package com.catstore.servicestore.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.catstore.servicestore.anotations.NumberStringConstraint;

public class NumberStringValidator implements ConstraintValidator<NumberStringConstraint, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
	        return false;
	    }
	    try {
	        Long d = Long.parseLong(value);
	        return (d >= 0);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	}

}
