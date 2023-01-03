package com.company;

import java.time.LocalDate;

public class Calendars implements Runnable{
    @Override
    public void run() {
        var date = LocalDate.now();
        System.out.println("Сегодня " + date.getDayOfWeek());
    }
}
