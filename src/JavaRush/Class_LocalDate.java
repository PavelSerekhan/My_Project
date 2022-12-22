package JavaRush;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Class_LocalDate {
//    public static void main(String[] args) {
    /**
     * Получение текущей даты.
     * Чтобы получить текущую дату, нужно воспользоваться статическим методом now().
     */
//        LocalDate today = LocalDate.now();
//        System.out.println("Сегодня " + today);
    /**
     * Получение даты в определенном часовом поясе.
     */
//        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
//        LocalDate localDate = LocalDate.now(zoneId);
//        System.out.println("Сейчас в Шанхае = " + localDate);
/**
 * Получение конкретной даты
 */
//        LocalDate date = LocalDate.of(1989, 10, 27);
//        System.out.println("Сегодня " + date);

    /**
     * Получение даты по номеру дня
     */
//        LocalDate date1 = LocalDate.ofYearDay(2019,100);
//        System.out.println(date1);
    /**
     * Получение даты Unix.
     * добавили метод ofEpochDay(), который возвращает дату, отсчитанную
     * от 1 января 1970 года
     */
//        LocalDate epoha = LocalDate.ofEpochDay(18517);
//        System.out.println("EPOHA" + epoha);
    /**
     * Получение фрагментов даты
     */
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfMonth());
    }
    /**
     *  Изменение даты в объекте LocalDate.
     */
//        LocalDate birthday = LocalDate.of(2022,10,27);
//        LocalDate nextBirthday = birthday.plusYears(1);
//
//        System.out.println("Следующее день рождения: " + nextBirthday);
//
//        LocalDate firstBirthday = birthday.minusYears(32);
//        System.out.println(firstBirthday);

    // Объект birthday, чьи методы мы вызываем, не меняется.
    // Вместо этого его методы возвращают новые объекты, которые и содержат нужные данные.


    /**
     * Реализуй метод getDayOfWeek(LocalDate date), чтобы он возвращал русское название дня
     * недели аргумента date. Воспользуйся методами getDayOfWeek и getDisplayName.
     */

//    static LocalDate birthDate = LocalDate.of(2020, 3, 12);
//
//    public static void main(String[] args) {
//        System.out.println(getDayOfWeek(birthDate));
//
//    }
//
//    static String getDayOfWeek(LocalDate date) {
//        //напишите тут ваш код
//        DayOfWeek day = date.getDayOfWeek();
//        String s = day.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
//        switch (month){
//            case JANUARY : return "Январь";
//            case FEBRUARY: return "Февраль";
//            case MARCH: return "Март";
//            case APRIL: return "Апрель";
//            case MAY: return "Май";
//            case JUNE: return "Июнь";
//            case JULY: return "Июль";
//            case AUGUST: return "Август";
//            case SEPTEMBER: return "Сентябрь";
//            case OCTOBER: return "Октябрь";
//            case NOVEMBER: return "Ноябрь";
//            case DECEMBER:return "Декабрь";
//        }
//        return s;
//    }
}
