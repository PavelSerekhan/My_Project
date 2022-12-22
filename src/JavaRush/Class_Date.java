package JavaRush;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Class_Date {
//    public static void main(String[] args) {
    /**
     * Чтобы получить текущее время и дату, достаточно просто создать объект типа Date.
     */

//        Date current = new Date();
//        System.out.println(current);

    /**
     * Задание определенной даты.
     * Все просто и очевидно, но есть два нюанса:
     * 1.Год нужно задавать от 1900.
     * 2.Месяцы нумеруются с нуля.
     */

//        Date birthday = new Date(89,9,27,12,10);
//        System.out.println("Я родился: " + birthday);
//        System.out.println(birthday.getYear());

    /**
     * У него есть методы, которые позволяют получить отдельные фрагменты его даты:
     * getYear() и т.д.
     * У объекта Date отдельные фрагменты даты можно не только получать, но и изменять:
     * setYear() и т.д.
     */

//        Date date = new Date(1117876500000L);
//        System.out.println(date);
    /**
     *  Сравнение дат
     *  Способ первый — просто сравнить количество миллисекунд, которое в них хранится:
     *  Способ второй — использовать метод before() объекта Date:
     *  Способ третий — использовать метод after() объекта Date:
     */

//        Date date1 = new Date(1117876500000L);
//        Date date2 = new Date(89,9,27,12,10);
//        if (date1.getTime() < date2.getTime())
//        if (date1.before(date2))  перед
//        if (date1.before(date2))  после
    /**
     * Класс DateFormat
     */


//        Date date3 = new Date(105, 5, 4, 12, 15, 0);
//        SimpleDateFormat format = new SimpleDateFormat("dd-MMMM-yyyy");
//        String message = format.format(date3);
//        System.out.println(message);
//
/**
 * Метод Date.parse
 */
//        Date date4 = new Date();
//        date4.setTime( Date.parse("Jul 06 12:15:00 2019") );
//        ||
//        Date date5 = new Date("Jul 06 12:15:00 2019");

    /**
     * Проинициализируй переменную birthDate объектом Date с датой своего рождения.
     * Реализуй метод getDayOfWeek(Date date), чтобы он возвращал русское название
     * дня недели аргумента date.
     */

//    static Date birthDay = new Date(120, Calendar.MARCH, 17);
//
//    public static void main(String[] args) {
//        System.out.println(getDayOfWeek(birthDay));
//    }
//
//    static String getDayOfWeek(Date date) {
//        String result = "";
//        int day = date.getDay();
//        switch (day) {
//            case 0 -> result = "воскресенье";
//            case 1 -> result = "понедельник";
//            case 2 -> result = "вторник";
//            case 3 -> result = "среда";
//            case 4 -> result = "четверг";
//            case 5 -> result = "пятница";
//            case 6 -> result = "суббота";
//        }
//        return result;

    /**
     * Метод fixDate принимает в качестве параметра список дат. Некоторые из них
     * содержат две типичные ошибки: неправильно сохраняются (и, следовательно,
     * выводятся в консоли) год и месяц. То есть, неправильная дата содержит всегда
     * две ошибки (год и месяц), которые тебе нужно исправить в методе fixDate,
     * учитывая эти условия:
     *
     * 1. Если дата больше текущей, в ней нужно исправить эти две ошибки (год и месяц)
     * с помощью методов setYear, setMonth. Год задается с 1900, а месяцы нумеруются с нуля.
     *
     * 2. Если дата меньше текущей, в ней ничего исправлять не нужно.
     */
//    public static void main(String[] args) {
//        List<Date> dateList = new ArrayList<>();
//        dateList.add(new Date(2015, 12, 25, 20, 40));
//        dateList.add(new Date("July 20, 1969"));
//        dateList.add(new Date(1989, 11, 9));
//        dateList.add(new Date("January 1, 2000"));
//
//        System.out.println("before fixes:");
//        dateList.forEach(System.out::println);
//
//        fixDate(dateList);
//
//        System.out.println("after fixes:");
//        dateList.forEach(System.out::println);
//    }
//    public static void fixDate(List<Date> brokenDates){
//        Date current = new Date();
//        for (int i = 0; i < brokenDates.size(); i++) {
//            if (brokenDates.get(i).getTime() > current.getTime()) {
//                brokenDates.get(i).setYear(brokenDates.get(i).getYear()-1900);
//                brokenDates.get(i).setMonth(brokenDates.get(i).getMonth()-1);
//
//            }
//        }
    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(formatter.format(date));
    }
    }

