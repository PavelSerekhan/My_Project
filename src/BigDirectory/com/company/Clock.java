package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Clock {
    public static void main(String[] args) {
//        Определить текущее время и дату
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int mouth = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);

//        Вывести приветствие
        if (hour < 12) {
            System.out.println("Доброе утро!\n");
        } else if (hour < 17) {
            System.out.println("Добрый день!\n");
        } else {
            System.out.println("Добрый вечер!\n");
        }

//        Начало формирования строки, отображающее время
        System.out.print("Сейчас ");

//        Сколько часов
        System.out.print(hour);
        System.out.print((hour != 1 & hour != 21) ? " часа (часов) " : "час");

//        Сколько минут
        if (minute != 0) {
            System.out.print(minute);
            System.out.print((minute != 1 & minute != 21 &
                    minute != 31 & minute != 41 & minute != 51) ?
                    " минуты (минут) " : " минута");
        }

//        Отображение числа месяца
        System.out.print("\n" + day + " ");

//        Название месяца
        switch (mouth) {
            case 1:
                System.out.print("янвapя");
                break;
            case 2:
                System.out.print("февраля");
                break;
            case 3:
                System.out.print("мapтa");
                break;
            case 4:
                System.out.print("aпpeля");
                break;
            case 5:
                System.out.print("мaя");
                break;
            case 6:
                System.out.print("июня");
                break;
            case 7:
                System.out.print("июля");
                break;
            case 8:
                System.out.print("августа");
                break;
            case 9:
                System.out.print("ceнтябpя");
                break;
            case 10:
                System.out.print("oктябpя");
                break;
            case 11:
                System.out.print("ноября");
                break;
            case 12:
                System.out.print("дeкaбpя");
        }
//        Отображение года
        System.out.println(", " + year);
    }
}
