package com.company;

import java.time.LocalTime;

public class Timer implements Runnable{
    @Override
    public void run() {
        var time = LocalTime.now();
        System.out.println("Сейчас на часах время " + time);

    }
}
