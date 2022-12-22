package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Lesson_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Сейчас " + dateTime);

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Сейчас " + date + " " + time);
    }
}
