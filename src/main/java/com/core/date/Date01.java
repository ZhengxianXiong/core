package com.core.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date01 {
    public static void main(String[] args) {
//        Date01.do1();
//        Date01.do2();
//        Date01.do3();

    }

    //
    //设置当前时间
    public static void do3() {
        //构造器设置
        //        GregorianCalendar gc = new GregorianCalendar(1999, Calendar.DECEMBER,31,23,59,59);
        //调用方法更改
        GregorianCalendar gc2 = new GregorianCalendar();
        gc2.set(Calendar.YEAR, 2019);
        gc2.set(Calendar.MONTH, Calendar.APRIL);
        gc2.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println(gc2.toString());
    }

    //获取当前时间信息
    public static void do2() {
        GregorianCalendar gc2 = new GregorianCalendar();
        int month = gc2.get(Calendar.MONTH);
        int weekday = gc2.get(Calendar.DAY_OF_WEEK);
        System.out.println("month:" + month + ",weekday:" + weekday);

    }

    //打印Date
    public static void do1() {
        Date deadline = new Date();
        if (deadline != null) {
            System.out.println(deadline.toString());
        }
    }
}
