package com.xz.boot2.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间推迟器,可以将当前时间推迟提前多久
 * @author Administrator
 *
 */
public class DateUtil {
	public static String getAfterDay(Date date,Integer year,Integer mon,Integer day,Integer hour,Integer min){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if(year!=null){
            calendar.add(Calendar.YEAR, year);
        }
        if(mon!=null){
            calendar.add(Calendar.MONTH, mon);
        }
        if(day!=null){
            calendar.add(Calendar.DAY_OF_YEAR, day);
        }
        if(hour!=null){
            calendar.add(Calendar.HOUR_OF_DAY, hour);
        }
        if(min!=null){
            calendar.add(Calendar.MINUTE, min);
        }
        return sdf.format(calendar.getTime());
    }
	
	public static void main(String[] args) throws Exception {
		String str=getAfterDay(new Date(),null,null,-7,null,null);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(str);
		int i=new Date().compareTo(sdf.parse(str));
		System.out.println(i);
	}
}
