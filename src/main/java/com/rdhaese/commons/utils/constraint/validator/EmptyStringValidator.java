package com.rdhaese.commons.utils.constraint.validator;

import com.rdhaese.commons.utils.constraint.NotEmpyString;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created on 7/05/2017.
 *
 * @author Robin D'Haese
 */
public class EmptyStringValidator implements ConstraintValidator<NotEmpyString, String> {

    @Override
    public void initialize(NotEmpyString constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return !StringUtils.isBlank(value);
    }
}
