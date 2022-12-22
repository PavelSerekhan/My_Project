package com.company;

import java.time.LocalTime;

public class Lesson_LocalTime {
    public static void main(String[] args) {
//        LocalTime time = LocalTime.now();
//        System.out.println("Сейчас " + time);

//        LocalTime time1 = LocalTime.of(12,15,9,100);
//        System.out.println(time1);

//        LocalTime time2 = LocalTime.of(12,44);
//        System.out.println(time2);

//        LocalTime timeSecond = LocalTime.ofSecondOfDay(10000);
//        System.out.println(timeSecond);

//        LocalTime now = LocalTime.now();
//        System.out.println(now.getHour());
//        System.out.println(now.getMinute());
//        System.out.println(now.getSecond());
//        System.out.println(now.getNano());

        LocalTime now = LocalTime.now();
        LocalTime time = now.plusHours(2);
        System.out.println(time);
        LocalTime time1 = now.minusMinutes(40);
        System.out.println(time1);
    }
}
