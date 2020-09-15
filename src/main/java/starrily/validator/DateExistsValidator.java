package starrily.validator;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateExistsValidator implements ConstraintValidator<DateExists, Date> {
	
	@Override
	public void initialize(DateExists annotation) {
	}
	
	@Override
	public boolean isValid(Date date, ConstraintValidatorContext context) {
		System.out.println(date);
		DateFormat dt = new SimpleDateFormat(date.toString());
		dt.setLenient(false);
		return true;
	}
}
