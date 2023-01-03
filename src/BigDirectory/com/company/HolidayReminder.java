package com.company;

public class HolidayReminder {
    public enum Month {
        JANUARY(),
        FEBRUARY,
        MARCH
    }

    public void printHolodays(Month month) {
        switch (month) {
            case JANUARY:
                System.out.println("7 января будет Рождество!");
                break;
            case FEBRUARY:
                System.out.println("В феврале празднуется День Защитника Отечества - 23 февраля!");
                break;
            case MARCH:
                System.out.println("В марте отмечается Всемирный Женский День - 8 марта!");
                break;
        }
    }

    public static void main(String[] args) {
        HolidayReminder reminder = new HolidayReminder();
        reminder.printHolodays(Month.FEBRUARY);
    }

}
