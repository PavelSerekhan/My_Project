package JavaRush;

import java.time.*;
import java.util.TreeSet;

public class Class_ZonedDateTime {
//    public static void main(String[] args) {
    /**
     * Чтобы получить список всех зон
     */
//        for(String s : ZoneId.getAvailableZoneIds())
//            System.out.println(s);
    /**
     * Чтобы получить объект ZoneId по его имени, нужно воспользоваться статическим методом of()
     */
//        ZoneId zone = ZoneId.of("Africa/Cairo");
//        System.out.println(zone);

    /**
     * Что общего у всех временных зон и Пекина?
     * Правильно! Они позволят нам потренироваться в использовании классов ZoneId и ZonedDateTime :)
     * <p>
     * Реализуй два метода:
     * <p>
     * в методе getSortedZones верни множество TreeSet всех временных зон;
     * в методе getBeijingTime верни текущую дату и время в Пекине (временная зона для него — "Asia/Shanghai").
     */

//    public static void main(String[] args) {
//        TreeSet<String> sortedZones = getSortedZones();
//        System.out.println(sortedZones.size());
//        System.out.println(sortedZones.first());
//        System.out.println(sortedZones.last());
//
//        System.out.println(getBeijingDateTime());
//    }
//
//    static TreeSet<String> getSortedZones() {
//        //напишите тут ваш код
//        TreeSet<String> tr = new TreeSet<>();
//        for (String s : ZoneId.getAvailableZoneIds())
//            tr.add(s);
//        return tr;
//    }
//
//    static ZonedDateTime getBeijingDateTime() {
//        //напишите тут ваш код
//        ZonedDateTime zo = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
//        return zo;
//    }

    /**
     * Создание объекта ZonedDateTime.
     */
    public static void main(String[] args) {

//        ZoneId zone = ZoneId.of("Africa/Cairo");
//        ZonedDateTime time = ZonedDateTime.now(zone);
//        System.out.println(time);
//        ||
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of("Africa/Cairo"));
        System.out.println(time);

        ZonedDateTime tim = ZonedDateTime.now(); //если не передать ZoneId,то от настроек компа выведет
        System.out.println(tim);  //Europe/Moscow

        /**
         * Преобразование глобальной даты в локальную
         */
        ZoneId zone = ZoneId.of("Africa/Cairo");
        ZonedDateTime cairoTime = ZonedDateTime.now(zone);

        LocalDate localDate = cairoTime.toLocalDate();
        LocalTime localTime = cairoTime.toLocalTime();
        LocalDateTime localDateTime = cairoTime.toLocalDateTime();
        /**
         * Работа со временем.
         * Все методы полностью аналогичны методам LocalDateTime. И, конечно, у класса
         * ZonedDateTime есть методы, которые позволяют работать с датой и временем.
         * При этом объект, у которого вызываются методы, не меняется: вместо этого методы
         * возвращают новый объект ZonedDateTime.
         */

    }
}
