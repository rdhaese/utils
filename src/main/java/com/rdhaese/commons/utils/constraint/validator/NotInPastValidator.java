package com.rdhaese.commons.utils.constraint.validator;

import com.rdhaese.commons.utils.constraint.NotInPast;
import org.apache.commons.lang3.StringUtils;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

/**
 * Created on 7/05/2017.
 *
 * @author Robin D'Haese
 */

public class NotInPastValidator implements ConstraintValidator<NotInPast, String> {

    private String timeFormat;

    @Override
    public void initialize(NotInPast constraintAnnotation) {
        timeFormat = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        //Responsibility for not null or empty is in other validator
        if (StringUtils.isBlank(value)){
            return true;
        }

        //Responsibility for correct patten is in other validator
        LocalDateTime givenDate;
        try {
            givenDate = LocalDateTime.parse(value);
        } catch (DateTimeParseException dtpe){
            return false;
        }

        return !givenDate.isBefore(LocalDateTime.now());

    }
}
