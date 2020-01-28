package com.catstore.servicestore.validations;

import java.util.Calendar;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.catstore.servicestore.anotations.FormatDateConstraint;

public class DateFormatValidator implements ConstraintValidator<FormatDateConstraint, String>{
	
	private static Pattern DATE_PATTERN = Pattern.compile("^\\d{4}/\\d{2}$");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		Boolean formatOk = DATE_PATTERN.matcher(value).matches();
		if (Boolean.TRUE.equals(formatOk)) {
			String[] sp = value.split("/");
			try {
				Integer year = Integer.parseInt(sp[0]);
				Integer month =  Integer.parseInt(sp[1]);
				Integer yearNow = Calendar.getInstance().get(Calendar.YEAR);
				Integer monthNow = Calendar.getInstance().get(Calendar.MONTH) + 1;
				return  (((year.compareTo(yearNow) == 0) && (month >= monthNow)) ||
						(year > yearNow)) && (month >= 1 && month <= 12); 
			} catch (NumberFormatException nfe) {
		        return false;
		    }
		}
		return false;
	}

}