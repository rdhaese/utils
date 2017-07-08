package com.rdhaese.commons.utils.constraint;


import com.rdhaese.commons.utils.constraint.validator.NotInPastValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created on 14/05/2017.
 *
 * @author Robin D'Haese
 */
@Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = NotInPastValidator.class)
@Documented
public @interface NotInPast {

    String message() default "Date cannot be in the past.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    String value();

    @Target({ FIELD, METHOD, PARAMETER, ANNOTATION_TYPE })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        String[] value();
    }
}
