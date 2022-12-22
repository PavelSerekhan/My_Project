package Book;

import javax.swing.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDate_Class {
    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.now();
//        LocalDate newYearsEve = LocalDate.of(2000,12,31);

//        int year = localDate.getYear();
//        System.out.println(year);

//        int month = localDate.getMonthValue();
//        System.out.println(month);

//        int day = localDate.getDayOfMonth();
//        System.out.println(day);

//        LocalDate localDate1 = localDate.plusDays(365);
//        System.out.println(localDate1);

        LocalDate date = LocalDate.now(); // Текущая дата
        int month = date.getMonthValue(); // текущий месяц
        int today = date.getDayOfMonth(); // текущий день в месяце

        date = date.minusDays(today - 1); // уст значение дня 1

        DayOfWeek weekday = date.getDayOfWeek(); // день недели, не цифра!
        int value = weekday.getValue();          // день в цифру

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print(" ");

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
