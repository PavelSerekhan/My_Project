package com.company;

import java.time.*;

public class Lesson_Instant {
    public static void main(String[] args) {
//        Instant instant = Instant.now();
//        System.out.println(instant);
//        for(String s : ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
//        }
//        ZoneId zone = ZoneId.of("Africa/Cairo");
//        ZonedDateTime time = ZonedDateTime.now();
//        System.out.println(time);

        ZoneId zone = ZoneId.of("Africa/Cairo");
        ZonedDateTime cairoTime = ZonedDateTime.now(zone);

        LocalDate localDate = cairoTime.toLocalDate();
        LocalTime localTime = cairoTime.toLocalTime();
        LocalDateTime localDateTime = cairoTime.toLocalDateTime();
        System.out.println(localDateTime);
    }
}
