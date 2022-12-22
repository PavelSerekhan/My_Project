package JavaRush;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Class_DateTimeFormatter {
//    public static void main(String[] args) {
    /**
     * Его цель — по максимуму облегчить преобразование даты и времени именно
     * в тот формат, который нужен программисту.
     */
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM-yy-h-m");
//        //Количество букв влияет на длину текста. Чем большое букв, тем длиннее будет текст.
//        String text = dtf.format(LocalDateTime.now());
//        System.out.println(text);
    /**
     * В методе main выведи на экран переменную localDateTime в таком виде:
     * 19.03.2020г. 5ч.4мин
     */

//        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyг. Hч.mмин");
//        String time = timeFormatter.format(LocalDateTime.now());
//        System.out.println(time);

    /**
     * В методе main выведи на экран переменную zonedDateTime в таком виде:
     * 4 9.3.19 06:03:07.319180500 Europe/Kiev
     * Где:
     * <p>
     * 4 — номер дня недели, т.е. четверг;
     * 9 — день месяца;
     * 3 — месяц;
     * 19 — год;
     * 06 — часы;
     * 03 — минуты;
     * 07 — секунды;
     * 319180500 — наносекунды;
     * Europe/Kiev — временная зона.
     */
//    static ZonedDateTime zonedDateTime = ZonedDateTime.now();
//
//    public static void main(String[] args) {
//
//        DateTimeFormatter fors = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
//        String zone = fors.format(zonedDateTime);
//        System.out.println(zone);
//    }
    /**
     * Парсинг времени
     */
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM-dd-yyyy", Locale.ENGLISH);
//        LocalDate date = LocalDate.parse("October-05-2022", formatter);
//        System.out.println(date);

    /**
     * Инициализируй статическую переменную dateTimeFormatter. Подумай, какой шаблон ей задать, чтобы можно было распарсить строку timeString.
     * В методе main создай объект LocalDateTime, используя строку timeString и твой шаблон dateTimeFormatter.
     */
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse(timeString, dateTimeFormatter);

        System.out.println(dateTime);
    }
}
