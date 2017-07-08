package com.rdhaese.commons.utils.transformers.date_and_time;

import com.rdhaese.commons.utils.constants.DateAndTimeConstants;
import com.rdhaese.commons.utils.transformers.AbstractTransformer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created on 27/05/2017.
 *
 * @author Robin D'Haese
 */
public class LocalDateTimeHHMMStringTransformer extends AbstractTransformer<LocalDateTime, String> {

    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(DateAndTimeConstants.HH_MM_TIME_FORMAT_JAVA);

    @Override
    public String transformFromNotNullProtected(LocalDateTime localDateTime) {
        return timeFormatter.format(localDateTime);
    }

    @Override
    public LocalDateTime transformBackNotNullProtected(String s) {
        return LocalDateTime.of(LocalDate.now(), LocalTime.from(timeFormatter.parse(s)));
    }
}
