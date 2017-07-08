package com.rdhaese.commons.utils.time;

import com.rdhaese.commons.utils.constants.DateAndTimeConstants;
import com.rdhaese.commons.utils.regex.RegexUtil;
import org.apache.commons.lang3.Validate;

import java.util.regex.Pattern;

/**
 * Created on 7/05/2017.
 *
 * @author Robin D'Haese
 */
public final class DurationUtil {

    private DurationUtil() {
    }

    public static String toDurationParsableStringAmount(final String hhmmString) {
        Validate.notNull(hhmmString, "hhmmString not valid [null]");
        Validate.isTrue(RegexUtil.isOfPattern(hhmmString, DateAndTimeConstants.HH_MM_TIME_AMOUNT_FORMAT_REGEX), "hhmmString not of valid pattern");

        return toDurationParsableString(hhmmString);
    }

    public static String toDurationParsableStringTime(final String hhmmString) {
        Validate.notNull(hhmmString, "hhmmString not valid [null]");
        Validate.isTrue(RegexUtil.isOfPattern(hhmmString, DateAndTimeConstants.HH_MM_TIME_FORMAT_REGEX), "hhmmString not of valid pattern");

        return toDurationParsableString(hhmmString);
    }

    private static String toDurationParsableString(String hhmmString) {
        Validate.notNull(hhmmString, "hhmmString not valid [null]");

        String[] hhmmSplitted = hhmmString.split(":");

        String firstChar = hhmmSplitted[0].substring(0,1);
        if ("0".equals(firstChar)){
            hhmmSplitted[0] = hhmmSplitted[0].substring(1);
        }
        firstChar = hhmmSplitted[1].substring(0,1);
        if ("0".equals(firstChar)){
            hhmmSplitted[1] = hhmmSplitted[1].substring(1);
        }

        StringBuilder sb =  new StringBuilder("PT");
        if (!"0".equals(hhmmSplitted[0])){
            sb.append(hhmmSplitted[0])
                    .append("H");
        }
        if (!"0".equals(hhmmSplitted[01])){
            sb.append(hhmmSplitted[1])
                    .append("M");
        }
        return sb.toString();
    }
}
