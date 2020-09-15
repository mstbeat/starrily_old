package starrily.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateExistsValidator.class)
@Documented
public @interface DateExists {

	String message() default "{EMSG002}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
