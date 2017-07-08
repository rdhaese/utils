package com.rdhaese.commons.utils.constants;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 8/07/2017.
 *
 * @author Robin D'Haese
 */
public final class DateAndTimeConstants {

    private DateAndTimeConstants(){}

    /*TIME*/
    public static final Map<String, String> TIME_REGEX_JAVA_FORMAT_MAP = new HashMap<>();
    public static final String HH_MM_TIME_AMOUNT_FORMAT_REGEX = "[\\d]{1,2}:[0-6][\\d]";
    public static final String HH_MM_TIME_FORMAT_REGEX = "(([0-2][0-4])|([0-1]{0,1}[\\d])):[0-6][\\d]";
    public static final String HH_MM_TIME_FORMAT_JAVA = "HH:mm";

    /*DATE_TIME*/
    public static final Map<String, String> DATE_TIME_REGEX_JAVA_FORMAT_MAP = new HashMap<>();
    public static final String YYYY_MM_DD_T_HH_MM_DATE_TIME_FORMAT_REGEX  = "[\\d]{4}-[0-1]{0,1}[\\d]-[0-3]{0,1}[\\d]T(([0-2][0-4])|([0-1]{0,1}[\\d])):[0-6][\\d]";
    public static final String YYYY_MM_DD_T_HH_MM_DATE_TIME_FORMAT_JAVA = "yyyy-MM-dd'T'HH:mm";
    public static final String DD_MM_YYYY_HH_MM_DATE_TIME_FORMAT_JAVA = "dd-MM-yyyy HH:mm";

    /*DATE*/
    public static final String DD_MM_YYYY_DATE_FORMAT_JAVA = "dd-MM-yyyy";

    static {
        TIME_REGEX_JAVA_FORMAT_MAP.put(HH_MM_TIME_AMOUNT_FORMAT_REGEX, HH_MM_TIME_FORMAT_JAVA);
        TIME_REGEX_JAVA_FORMAT_MAP.put(HH_MM_TIME_FORMAT_REGEX, HH_MM_TIME_FORMAT_JAVA);
        DATE_TIME_REGEX_JAVA_FORMAT_MAP.put(YYYY_MM_DD_T_HH_MM_DATE_TIME_FORMAT_REGEX, YYYY_MM_DD_T_HH_MM_DATE_TIME_FORMAT_JAVA);
    }
}
