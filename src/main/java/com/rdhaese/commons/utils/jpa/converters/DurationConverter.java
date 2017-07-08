package com.rdhaese.commons.utils.jpa.converters;

import javax.persistence.AttributeConverter;
import java.time.Duration;

/**
 * Created on 19/04/2017.
 *
 * @author Robin D'Haese
 */
//@Converter(autoApply = true)
public class DurationConverter implements AttributeConverter<Duration, String> {
    @Override
    public String convertToDatabaseColumn(Duration duration) {
        return duration == null ? null : duration.toString();
    }

    @Override
    public Duration convertToEntityAttribute(String dbData) {
        return dbData == null ? null : Duration.parse(dbData);
    }
}
