package com.company;

import java.net.CacheRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Lesson_Calendar {
    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        int era = calendar.get(Calendar.ERA);
//        System.out.println(era);
//        int year = calendar.get(Calendar.YEAR);
//        System.out.println(year);
//        int month = calendar.get(Calendar.MONTH);
//        System.out.println(month);
//        int day = calendar.get(Calendar.DAY_OF_MONTH);
//        System.out.println(day);
//        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
//        System.out.println(dayOfWeek);
//        int hour = calendar.get(Calendar.HOUR);
//        System.out.println(hour);
//        int minute = calendar.get(Calendar.MINUTE);
//        System.out.println(minute);
//        int second = calendar.get(Calendar.SECOND);
//        System.out.println(second);

//        Calendar calendar = new GregorianCalendar();
//        calendar.set(Calendar.YEAR,1989);
//        calendar.set(Calendar.MONTH,Calendar.OCTOBER);
//        calendar.set(Calendar.DAY_OF_MONTH,27);
//        calendar.set(Calendar.HOUR,0);
//        calendar.set(Calendar.MINUTE,5);
//        System.out.println(calendar.getTime());

//        Calendar calendar = new GregorianCalendar(2022,Calendar.JULY,25);
//        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY){
//            System.out.println("This is MONDAY");
//        }else{
//            System.out.println("HUI");
//        }

//        Calendar calendar = new GregorianCalendar(2019,Calendar.FEBRUARY,27);
////        calendar.add(Calendar.DAY_OF_MONTH,2);
////        System.out.println(calendar.getTime());
////        calendar.add(Calendar.MONTH, -2);
////        System.out.println(calendar.getTime());
//        calendar.roll(Calendar.MONTH,-2);//roll меняет только определенный элемент(месяц)
//        System.out.println(calendar.getTime());


//        Calendar calendar = new GregorianCalendar(2022, Calendar.JULY, 25);
//        calendar.set(Calendar.HOUR, 20);
//        calendar.set(Calendar.MINUTE, 5);
//        calendar.set(Calendar.SECOND, 12);
//
//        calendar.add(Calendar.MONTH, -1);
//        System.out.println(calendar.getTime());

//        Calendar calendar = new GregorianCalendar(2022,Calendar.JULY,25);
//        calendar.set(Calendar.HOUR,20);
//        calendar.set(Calendar.MINUTE,20);
//        calendar.set(Calendar.SECOND,30);
//
//        System.out.println("Год: " + calendar.get(Calendar.YEAR));
//        System.out.println("Месяц: " + calendar.get(Calendar.MONTH));
//        System.out.println("Порядковый номер недели в месяце: " + calendar.get(Calendar.WEEK_OF_MONTH));
//
//        System.out.println("Число: " + calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println("Часы: " + calendar.get(Calendar.HOUR));
//        System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
//        System.out.println("Секунды: " + calendar.get(Calendar.SECOND));
//        System.out.println("Миллисекунды: " + calendar.get(Calendar.MILLISECOND));

//        Calendar calendar = new GregorianCalendar(216,Calendar.AUGUST,2);
//        calendar.set(Calendar.ERA,GregorianCalendar.BC);
//        DateFormat df = new SimpleDateFormat("dd MMM yyy GG");
//        System.out.println(df.format(calendar.getTime()));


        String strDate = "Sat, April 4, 2020";
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        try {
            Date date = formatter.parse(strDate);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
