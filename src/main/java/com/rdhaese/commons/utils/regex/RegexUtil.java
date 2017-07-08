package com.rdhaese.commons.utils.regex;

import org.apache.commons.lang3.Validate;

import java.util.regex.Pattern;

/**
 * Created on 8/07/2017.
 *
 * @author Robin D'Haese
 */
public final class RegexUtil {

    private RegexUtil(){}

    public static boolean isOfPattern(final String valueToCheck, final String regex){
        Validate.notNull(valueToCheck, "valueToCheck not valid [null]");
        Validate.notNull(regex, "regex not valid [null]");

        return Pattern
                .compile(regex)
                .matcher(valueToCheck)
                .matches();
    }
}
