package com.xz.boot2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainTest {
    public static void main(String[] args)
    {
//		System.out.println(System.currentTimeMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatStr =formatter.format(new Date());
        System.out.println(formatStr);

        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatStr2 =formatter2.format(new Date());
        System.out.println(formatStr2);


    }

//    public static void main(String[] args) throws Exception {
//        User user = FactoryDao.getUserDAO().getUserById("user");            //从数据库获取对象
//        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //创建要显示的日期格式
//        //注意了，这里的   MM 在java中代表月份，而  mm 代表分钟， HH 代表24小时制的时间， hh 代表12小时制的时间,很严格的
//
//        Date date = fmt.parse(user.getTime());      //将从数据库读出来的 timestamp 类型的时间转换为java的Date类型
//        String s = fmt.format(date);                //将这个时间格式化，转换为String类型
//        System.out.println("user.getTime()        : "+user.getTime());         //打印原本从数据库读出来的 timestamp 类型日期
//        System.out.println("date.toLocaleString() : "+date.toLocaleString());  //打印使用Date.toLocaleString()方法得到的日期
//        System.out.println("fmt.format(date)      : "+s);                      //打印格式化之后的日期，这是最理想的日期格式
//
//
//        /*Date To String*/
//        String str = fmt.format(date);
//
//        /*String To Date*/
//        Date d = fmt.parse(s);
//
//    }
}
