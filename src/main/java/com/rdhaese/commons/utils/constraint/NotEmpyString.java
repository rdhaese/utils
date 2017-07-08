package com.rdhaese.commons.utils.constraint;


import com.rdhaese.commons.utils.constraint.validator.EmptyStringValidator;

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
@Constraint(validatedBy = EmptyStringValidator.class)
@Documented
public @interface NotEmpyString {

    String message() default "Cannot be empty.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };



}
