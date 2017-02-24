package com.birds.boot.helpers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    public static String convertToString(Date date, String format) {
        if (null == date) {
            return null;
        }
        DateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    public static Date convertDate(String strDate, String format) {
        if (strDate == null || "".equals(strDate)) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = sdf.parse(strDate);
        } catch (ParseException e) {
            return null;
        }
        return date;
    }

}
