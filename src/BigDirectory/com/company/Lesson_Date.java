package com.company;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lesson_Date {
    public static void main(String[] args) throws InterruptedException {
//        Date current = new Date();
//        System.out.println(current);
//        Date current = new Date(122, 6, 4, 12, 15, 0);
//
//        Date date = new Date();
//        System.out.println(date);
//        Date current1 = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-YYYY");
//        String message = formatter.format(current);
//        System.out.println(message);

//        long time = date.getTime();
//        System.out.println(time );
//        Date date1 = new Date(1658393646876L);
//        System.out.println(date1);

//        SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-YYYY");
//        String str = format1.format(date1);
//        System.out.println(str);

//        if (current.after(date)){
//            System.out.println(current);
//        }else{
//            System.out.println(date);
//        }

//        Date s = current.after(date) ? current : date;
//        System.out.println(s);


//        System.out.println(curremt);
//        System.out.println(curremt.getYear());
//        System.out.println(curremt.getDate());
//        System.out.println(curremt.getMonth());

//        Date date = new Date(1537876500000L);
//        System.out.println(date);

//        Date date = new Date();
//        date.setTime( Date.parse("Jul 06 12:15:00 2019") );

//        Date date = new Date(1212121212121L);
//        System.out.println(date);

//        Date date1= new Date();
//        Date date2 = new Date();
//        System.out.println((date1.getTime() > date2.getTime()) ? "date1 позже date2" : "date1 раньше date2");


        Date date1 = new Date();
//        Thread.sleep(2000);
//        Date date2 = new Date();
//        System.out.println(date1.before(date2));//до
//        System.out.println(date1.after(date2));//после
//        System.out.println(date1.equals(date2));//равно
        System.out.println(date1.getHours());

    }
}
