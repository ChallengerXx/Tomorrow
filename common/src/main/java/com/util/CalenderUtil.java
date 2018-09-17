package com.util;

import java.util.Calendar;

/**
 * 时间工具类
 */
public class CalenderUtil {

    /**
     * 根据数据日期获取开始时间
     * @param dataTime
     * @return
     */
    public static long getDayStart(long dataTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(dataTime);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    /**
     * 根据数据日期获取结束时间
     * @param dataTime
     * @return
     */
    public static long getDayEnd(long dataTime){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(dataTime);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTimeInMillis() / 1000;
    }

    /**
     * 根据指定时间 获取指定天数之前之后的日期开始时间
     * @param dataTime
     * @param addDay
     * @return
     */
    public static long getAddDayStart(long dataTime,int addDay){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(dataTime);
        calendar.add(Calendar.DATE,addDay);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    /**
     * 根据指定时间 获取指定天数之前之后的日期结束时间
     * @param dataTime
     * @param addDay
     * @return
     */
    public static long getAddDayEnd(long dataTime,int addDay){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(dataTime);
        calendar.add(Calendar.DATE,addDay);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        return calendar.getTimeInMillis() / 1000;
    }

    public static void main(String[] args) {
        long startTime = getAddDayStart(1534922745, 0);
        long endTime = getAddDayEnd(1534922745, 0);
        System.out.println(startTime + " === " + endTime);

    }
}
