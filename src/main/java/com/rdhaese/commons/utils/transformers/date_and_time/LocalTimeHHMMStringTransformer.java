package com.rdhaese.commons.utils.transformers.date_and_time;

import com.rdhaese.commons.utils.constants.DateAndTimeConstants;
import com.rdhaese.commons.utils.transformers.AbstractTransformer;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created on 26/05/2017.
 *
 * @author Robin D'Haese
 */
public class LocalTimeHHMMStringTransformer extends AbstractTransformer<LocalTime, String> {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DateAndTimeConstants.HH_MM_TIME_FORMAT_JAVA);

    @Override
    protected String transformFromNotNullProtected(LocalTime localTime) {
        return dateTimeFormatter.format(localTime);
    }

    @Override
    protected LocalTime transformBackNotNullProtected(String s) {
        return LocalTime.from(dateTimeFormatter.parse(s));
    }
}
