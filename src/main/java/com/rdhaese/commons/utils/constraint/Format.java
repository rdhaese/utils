package com.rdhaese.commons.utils.constraint;


import com.rdhaese.commons.utils.constraint.validator.FormatValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created on 7/05/2017.
 *
 * @author Robin D'Haese
 */
@Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = FormatValidator.class)
@Documented
public @interface Format {

    String message() default "Not allowed format.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    String value();

    boolean canBeNull() default false;

    /**
     * Only important if canBeNul is true
     */
    boolean canBeEmpty() default true;

    @Target({ FIELD, METHOD, PARAMETER, ANNOTATION_TYPE })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        String[] value();
    }
}
