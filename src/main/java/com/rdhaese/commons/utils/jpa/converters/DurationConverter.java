package com.rdhaese.commons.utils.jpa.converters;

import com.rdhaese.commons.utils.transformers.Transformer;
import com.rdhaese.commons.utils.transformers.date_and_time.DurationHHMMStringTransformer;

import javax.persistence.AttributeConverter;
import java.time.Duration;

/**
 * Created on 19/04/2017.
 *
 * @author Robin D'Haese
 */
public class DurationConverter implements AttributeConverter<Duration, String> {

    private final Transformer<Duration, String> durqtionTransformer;

    public DurationConverter() {
        durqtionTransformer = new DurationHHMMStringTransformer();
    }

    @Override
    public String convertToDatabaseColumn(Duration duration) {
        return durqtionTransformer.transformFrom(duration);
    }

    @Override
    public Duration convertToEntityAttribute(String dbData) {
        return durqtionTransformer.transformBack(dbData);
    }
}
