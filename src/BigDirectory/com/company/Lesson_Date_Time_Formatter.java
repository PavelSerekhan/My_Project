package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Lesson_Date_Time_Formatter {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yy");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.ENGLISH);
        String text = dtf.format(LocalDateTime.now());
        String text1 = dtf1.format(LocalDateTime.now());
        System.out.println(text);
        System.out.println(text1);


    }
}
