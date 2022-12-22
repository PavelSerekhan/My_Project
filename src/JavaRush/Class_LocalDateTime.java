package JavaRush;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Class_LocalDateTime {
//    public static void main(String[] args) {
/**
 * Класс LocalDateTime объединяет в себе возможности классов LocalDate и LocalTime:
 * он хранит и дату, и время. Его объекты тоже неизменяемые, и его методы также аналогичны
 * методам классов LocalDate и LocalTime.
 *
 * Получение текущего момента: дата и время
 */
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println("Сейчас: " + now);
/**
 * Получение определенного момента: дата и время.
 */
    //= LocalDateTime.of(год, месяц, день, часы, минуты, секунды);

//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        LocalDateTime current = LocalDateTime.of(date,time);
//        System.out.println("Сейчас = " + current);

//        LocalDateTime dat = LocalDateTime.of(2019, 5, 15, 12, 15, 00);
//        System.out.println("Сейчас = " + dat);


    /**
     * Реализуй метод isWeekend. Он должен определять, относится ли параметр dateTime
     * к выходным.
     * Считаем выходными промежуток между 22:00 пятницы (включительно) и 23:00
     * воскресенья (не включительно).
     * <p>
     * Метод isWeekend должен вернуть true, если параметр dateTime попадает в заданный
     * временной промежуток.
     */
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;
    private static final int WEEKEND_START_FRIDAY_CUT_OFF_HOUR = 22;
    private static final int WEEKEND_END_SUNDAY_CUT_OFF_HOUR = 23;

    public static void main(String[] args) {
        List<LocalDateTime> dateTimeList = new ArrayList<>();

        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 18, 39));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 21, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 22, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 23, 5, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 8, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 22, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 23, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 25, 11, 5));

        for (LocalDateTime dateTime : dateTimeList) {
            System.out.println(dateTime + ", is weekend - " + isWeekend(dateTime));
        }

    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        //напишите тут ваш код


        return false;
    }
}
