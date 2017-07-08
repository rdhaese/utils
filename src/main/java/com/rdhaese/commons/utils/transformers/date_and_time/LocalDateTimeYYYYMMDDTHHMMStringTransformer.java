package com.rdhaese.commons.utils.transformers.date_and_time;

import com.rdhaese.commons.utils.constants.DateAndTimeConstants;
import com.rdhaese.commons.utils.transformers.AbstractTransformer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created on 26/05/2017.
 *
 * @author Robin D'Haese
 */
public class LocalDateTimeYYYYMMDDTHHMMStringTransformer extends AbstractTransformer<LocalDateTime, String> {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DateAndTimeConstants.YYYY_MM_DD_T_HH_MM_DATE_TIME_FORMAT_JAVA);

    @Override
    public String transformFromNotNullProtected(LocalDateTime localDateTime) {
        return dateTimeFormatter.format(localDateTime);
    }

    @Override
    public LocalDateTime transformBackNotNullProtected(String s) {
        return LocalDateTime.from(dateTimeFormatter.parse(s));
    }
}
