package JavaRush;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Class_Calendar {
//    public static void main(String[] args) {
    // Статический метод getInstance() класса Calendar создаст объект Calendar, инициализированный текущей датой
//        Calendar date = Calendar.getInstance();
//        System.out.println(date.getTime());

//        Calendar calendarik = new GregorianCalendar(1989, 9, 27);
//        System.out.println(calendarik.getTime());
    /**
     * Работа с фрагментами даты
     */

//        int mont = calendarik.get(Calendar.MONTH); // число!
//
//        Calendar calendar1 = Calendar.getInstance();
//        int era = calendar1.get(Calendar.ERA);
//        int year = calendar1.get(Calendar.YEAR);
//        int month = calendar1.get(Calendar.MONTH);
//        int day = calendar1.get(Calendar.DAY_OF_MONTH);
//        int dayOfWeek = calendar1.get(Calendar.DAY_OF_WEEK);
//        int hour = calendar1.get(Calendar.HOUR);
//        int minute = calendar1.get(Calendar.MINUTE);
//        int second = calendar1.get(Calendar.SECOND);


//        Calendar calendar = new GregorianCalendar();
//        calendar.set(Calendar.YEAR, 2019);
//        calendar.set(Calendar.MONTH, 6);
//        calendar.set(Calendar.DAY_OF_MONTH, 4);
//        calendar.set(Calendar.HOUR_OF_DAY, 12);
//        calendar.set(Calendar.MINUTE, 15);
//        calendar.set(Calendar.SECOND, 0);

//        System.out.println(calendar.getTime());

    /**
     * Константы класса Calendar
     */

//        Calendar calendar2 = new GregorianCalendar(1989, Calendar.OCTOBER, 27);
//        if (calendar2.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
//            System.out.println("Это пятница");
//        }
/**
 * Изменение даты в объекте Calendar
 */
//        Calendar cal = new GregorianCalendar(2022, Calendar.OCTOBER, 4);
//        cal.add(Calendar.MONTH, 2);
////       System.out.println(cal.getTime());
//        cal.add(Calendar.MONTH, -2);
////        System.out.println(cal.getTime());
/**
 * Прокручивание фрагментов даты
 *
 * хочется что-то сделать с одной частью даты, не меняя все остальное.
 */
//        Calendar cale = new GregorianCalendar(2019, Calendar.FEBRUARY, 27);
//        System.out.println(cale.getTime());
//        cale.roll(Calendar.MONTH,-2);
//        System.out.println(cale.getTime());

    /**
     * Проинициализируй переменную birthDate объектом GregorianCalendar с
     * датой своего рождения. Реализуй метод getDayOfWeek(Calendar calendar),
     * чтобы он возвращал русское название дня недели аргумента calendar.
     * Помни, что в григорианском календаре неделя начинается с воскресенья.
     */
//    static Calendar birthDate = new GregorianCalendar(1989, Calendar.OCTOBER, 27);
//
//    public static void main(String[] args) {
//        System.out.println(getDayOfWeek(birthDate));
//    }
//
//    static String getDayOfWeek(Calendar calendar) {
//        //напишите тут ваш код
//        int day = calendar.get(Calendar.DAY_OF_WEEK);
//        String str = "";
//        switch (day) {
//            case 1:
//                return "воскресенье";
//            case 2:
//                return "понедельник";
//            case 3:
//                return "Вторник";
//            case 4:
//                return "Среда";
//            case 5:
//                return "Четверг";
//            case 6:
//                return "Пятница";
//            case 7:
//                return "Суббота";
//        }
//        return str;
//    }

    /**
     * Цикл while должен был завершиться за 31 итерацию, но почему-то зациклился.
     * Найди и исправь ошибку.
     */

//    public static void main(String[] args) {
//        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
//        Calendar end = new GregorianCalendar(2014,Calendar.FEBRUARY,2);
//
//        System.out.print("Start");
//
//
//        while (start.before(end)){
//            start.add(Calendar.DATE,1);// roll
//            System.out.print("." );
//        }
//        System.out.println("Finish");
//        System.out.println(start.getTime());
//    }

    /**
     * В классе Solution константа INVENTION_DAY содержит дату изобретения нового популярного гаджета — карманного телепорта.
     *
     * Реализуй метод isTeleportInvented, который в качестве параметра принимает дату и сравнивает ее с INVENTION_DAY. Если переданная дата следует после даты изобретения, нужно вывести надпись: "Пожалуйста, можете забрать ваш карманный телепорт. Спасибо за ожидание!" — и вернуть true.
     * Если переданная дата предшествует дате изобретения, вывести: "Извините, телепорт еще не изобрели, приходите через 10 лет." — и вернуть false.
     *
     * В методе main в цикле вызови isTeleportInvented и передай currentDay в качестве параметра. Если метод возвращает false, прибавь к currentDay 10 лет, иначе — выйди из цикла.
     */
    public static final String INVENTED =
            "Пожалуйста, можете забрать ваш карманный телепорт. Спасибо за ожидание!";
    public static final String NOT_INVENTED =
            "Извините, телепорт еще не изобрели, приходите через 10 лет.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar
            (2192,Calendar.JULY,12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();
        //напишите тут ваш код
        while (true){
            if (isTeleportInvented(currentDay) == false) {
                currentDay.add(Calendar.YEAR,10);
            } else {
                break;
            }
        }
    }

    static boolean isTeleportInvented(Calendar currentDay) {
        //напишите тут ваш код
        if (currentDay.after(INVENTION_DAY)){
            System.out.println(INVENTED);
            return true;
        } else if (currentDay.before(INVENTION_DAY))
            System.out.println(NOT_INVENTED);
        return false;
    }

}


