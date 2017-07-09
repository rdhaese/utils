package com.rdhaese.commons.utils.transformers.date_and_time;

import com.rdhaese.commons.utils.constants.DateAndTimeConstants;
import com.rdhaese.commons.utils.transformers.AbstractTransformer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created on 27/05/2017.
 *
 * @author Robin D'Haese
 */
public class LocalDateDDMMYYYYStringTransformer extends AbstractTransformer<LocalDate, String> {

    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(DateAndTimeConstants.DD_MM_YYYY_DATE_FORMAT_JAVA);

    @Override
    protected String transformFromNotNullProtected(LocalDate localDate) {
        return dateFormat.format(localDate);
    }

    @Override
    protected LocalDate transformBackNotNullProtected(String s) {
        return LocalDate.from(dateFormat.parse(s));
    }
}
