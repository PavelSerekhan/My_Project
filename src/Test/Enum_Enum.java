package Test;

import java.util.Arrays;

/**
 * Enumeration — перечисление
 * Enum — перечисление, набор строковых констант, объединенных общим типом.
 * Объявляется через ключевое слово — enum.
 */

public class Enum_Enum {

//    public enum Day {
//        MONDAY,
//        TUESDAY,
//        WEDNESDAY,
//        THURSDAY,
//        FRIDAY,
//        SATURDAY,
//        SUNDAY
//    }

//    public static void main(String[] args) {
//        Day day = Day.FRIDAY;
//        System.out.println(Day.FRIDAY);

//        Day[] days = Day.values();
//        for (Day d : days){
//            System.out.println(d);
//        }
//        System.out.println(days[2]);

//        System.out.println(Day.FRIDAY.ordinal());


    /**
     * JavarushQuest
     */

//        JavarushQuest[] javarushQuests = JavarushQuest.values();
//        for (JavarushQuest java : javarushQuests){
//            System.out.println(java.ordinal() + " " + java);
//        }

//        String str = Day.MONDAY.toString();// преобразование в строку
//        Day day = Day.valueOf("MONDAY"); // Для обратного преобразования

//        int index = Day.MONDAY.ordinal(); //Преобразование в число
//        Day days = Day.values()[2]; //Для обратного преобразования


//        Day day = Day.FRIDAY;
//        switch (day) {
//            case MONDAY:
//                System.out.println("Понедельник");
//                break;
//            case TUESDAY:
//                System.out.println("Вторник");
//                break;
//            case WEDNESDAY:
//                System.out.println("Среда");
//                break;
//            case THURSDAY:
//                System.out.println("Четверг");
//                break;
//            case FRIDAY:
//                System.out.println("Пятница");
//                break;
//            case SATURDAY:
//                System.out.println("Суббота");
//                break;
//            case SUNDAY:
//                System.out.println("Воскресенье");
//                break;
//        }

//        Day day = Day.FRIDAY;
//        switch (day) {
//            case MONDAY -> System.out.println("Понедельник");
//            case TUESDAY -> System.out.println("Вторник");
//            case WEDNESDAY -> System.out.println("Среда");
//            case THURSDAY -> System.out.println("Четверг");
//            case FRIDAY -> System.out.println("Пятница");
//            case SATURDAY -> System.out.println("Суббота");
//            case SUNDAY -> System.out.println("Воскресенье");
//        }

    public enum Month {

        JANUARY("Январь", 31),
        FEBRUARY("Февраль", 28),
        MARCH("Март", 31),
        APRIL("Апрель", 30),
        MAY("Май", 31),
        JUNE("Июнь", 30),
        JULY("Июль", 31),
        AUGUST("Август", 31),
        SEPTEMBER("Сентябрь", 30),
        OCTOBER("Октябрь", 31),
        NOVEMBER("Ноябрь", 30),
        DECEMBER("Декабрь", 31);

        private String name;
        private int dayCount;

        Month(String name, int dayCount) {
            this.name = name;
            this.dayCount = dayCount;
        }

        public static Month[] getWinterMonths(){
            return new  Month[]{DECEMBER,JANUARY,FEBRUARY};
        }

        public static Month[] getSummerMonths(){
            return new Month[]{JUNE,JULY,AUGUST};
        }

        @Override
        public String toString() {
            return "Month{" +
                    "name = '" + name + '\'' +
                    ", dayCount = " + dayCount +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Month.getSummerMonths()));
    }
}





