package com.rdhaese.commons.utils.constraint.validator;

import com.rdhaese.commons.utils.constraint.Format;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * Created on 7/05/2017.
 *
 * @author Robin D'Haese
 */

public class FormatValidator implements ConstraintValidator<Format, String> {

    private String format;
    private Boolean canBeNull;
    private Boolean canBeEmpty;

    @Override
    public void initialize(Format constraintAnnotation) {
        format = constraintAnnotation.value();
        canBeNull = constraintAnnotation.canBeNull();
        canBeEmpty = constraintAnnotation.canBeEmpty();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if ((canBeNull) && (null == value)){
            return true;
        }else if ((canBeNull) && (canBeEmpty) && (StringUtils.isBlank(value))){
            return true;
        }else if (StringUtils.isBlank(value)) {
            return Boolean.FALSE;
        }

        return Pattern
                .compile(format)
                .matcher(value)
                .matches();
    }
}
