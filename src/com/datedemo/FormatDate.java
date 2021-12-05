package com.datedemo;

/*
*@author zhangxl
*@Date 2021/12/5 20:35
*@description
*/


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatDate {
    private final static String FORMAT_HOUR_MINUTE = "HH:mm";
    private final static String FORMAT_DATE = "yyyy-MM-dd HH:mm:ss";
    private final static String FORMAT_EXCEL = "EEE MMM dd HH:mm:ss Z yyyy";
    private final static String FORMAT_YEAR = "yyyy";
    private final static String FORMAT_YEAR_MOUTH = "yyyy-MM";
    private final static String FORMAT_YEAR_MOUTH_DAY = "yyyy-MM-dd";
    private final static String FORMAT_HOUR_MINUTE_SECOND = "HH:mm:ss";

    /**日期类型 指定格式 格式化*/

    /**
     * HH:mm
     *
     * @param date
     * @return
     */
    public static String dateToFormatHourMinute(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_HOUR_MINUTE);
        String format = sdf.format(date);
        return format;
    }

    /**
     * yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATE);
        String format = sdf.format(date);
        return format;
    }

    /**
     * yyyy
     *
     * @param date
     * @return
     */
    public static String dateToFormatYear(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_YEAR);
        String format = sdf.format(date);
        return format;
    }

    /**
     * yyyy-MM
     *
     * @param date
     * @return
     */
    public static String dateToFormatYearMouth(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_YEAR_MOUTH);
        String format = sdf.format(date);
        return format;
    }

    /**
     * yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static String dateToFormatYearMouthDay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_YEAR_MOUTH_DAY);
        String format = sdf.format(date);
        return format;
    }

    /**
     * HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String dateToFormatHourMinuteSecond(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_HOUR_MINUTE_SECOND);
        String format = sdf.format(date);
        return format;
    }

    /**
     * 读取excel中日期，将日期字符串转换成日期，再将日期转换成  字符串，不能直接转换
     * @param parame
     * @return
     */
    public static String dateToExcel(String parame) {
        String format = null;
        String url = "Sun Dec 31 03:10:00 CST 1899";
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_EXCEL, Locale.UK);
        try {
            Date parse = sdf.parse(parame);
            SimpleDateFormat sdf1 = new SimpleDateFormat(FORMAT_HOUR_MINUTE);
            format = sdf1.format(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return format;
    }


    /**字符串类型日期 指定格式 格式化   结果可以是日期，或者是  另一种类型的字符串的日期*/


    /**
     * HH:mm
     *
     * @param letter
     * @return
     */
    public static String letterToFormatHourMinute(String letter) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_HOUR_MINUTE);
        Date format = null;
        try {
            format = sdf.parse(letter);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * yyyy-MM-dd HH:mm:ss
     *
     * @param letter
     * @return
     */
    public static String letterFormatDate(String letter) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATE);
        try {
            Date format = sdf.parse(letter);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * yyyy
     *
     * @param letter
     * @return
     */
    public static String letterToFormatYear(String letter) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_YEAR);
        try {
            Date format = sdf.parse(letter);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * yyyy-MM
     *
     * @param letter
     * @return
     */
    public static String letterToFormatYearMouth(String letter) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_YEAR_MOUTH);
        try {
            Date format = sdf.parse(letter);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * yyyy-MM-dd
     *
     * @param letter
     * @return
     */
    public static String letterToFormatYearMouthDay(String letter) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_YEAR_MOUTH_DAY);
        try {
            Date format = sdf.parse(letter);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * HH:mm:ss
     *
     * @param letter
     * @return
     */
    public static String letterToFormatHourMinuteSecond(String letter) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_HOUR_MINUTE_SECOND);
        try {
            Date format = sdf.parse(letter);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }



    public static String dateToStr(String FORMAT_HOUR_MINUTE) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_HOUR_MINUTE);
        String format = sdf.format(date);
        return format;
    }

}
