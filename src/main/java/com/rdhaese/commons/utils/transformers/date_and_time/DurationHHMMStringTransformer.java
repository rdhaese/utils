package com.rdhaese.commons.utils.transformers.date_and_time;

import com.rdhaese.commons.utils.constants.DateAndTimeConstants;
import com.rdhaese.commons.utils.time.DurationUtil;
import com.rdhaese.commons.utils.transformers.AbstractTransformer;
import org.apache.commons.lang3.time.DurationFormatUtils;

import java.time.Duration;

/**
 * Created on 26/05/2017.
 *
 * @author Robin D'Haese
 */
public class DurationHHMMStringTransformer extends AbstractTransformer<Duration, String> {

    @Override
    protected String transformFromNotNullProtected(Duration duration) {
        return DurationFormatUtils.formatDuration(duration.toMillis(), DateAndTimeConstants.HH_MM_TIME_FORMAT_JAVA);
    }

    @Override
    protected Duration transformBackNotNullProtected(String s) {
        return Duration.parse(DurationUtil.toDurationParsableStringAmount(s));
    }
}
