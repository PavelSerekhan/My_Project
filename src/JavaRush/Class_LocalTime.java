package JavaRush;

import java.time.LocalTime;

public class Class_LocalTime {
//    public static void main(String[] args) {
/**
 * Класс LocalTime создан для случаев, когда нужно работать только со временем без даты.
 *
 * Получение текущего времени
 */
//        LocalTime time = LocalTime.now();
//        System.out.println(time); //После точки указывается текущее значение наносекунд.
    /**
     * Получение заданного времени
     */
//        LocalTime time1 = LocalTime.of(12,15,0,100);
//        System.out.println("Сейчас = " + time1);
//        LocalTime time2 = LocalTime.of(12,15,0);
//        LocalTime time3 = LocalTime.of(12,15);
    /**
     * Получение времени по номеру секунды.
     */
//        LocalTime second = LocalTime.ofSecondOfDay(10000);
//        System.out.println(second);
    /**
     * Получение фрагментов времени
     */
//        LocalTime now = LocalTime.now();
//        System.out.println(now.getNano());
//        System.out.println(now.getSecond());
//        System.out.println(now.getMinute());
//        System.out.println(now.getHour());
    /**
     * Изменение времени в объекте класса LocalTime
     */
//        LocalTime localTime = LocalTime.now();
//        LocalTime localTime1 = localTime.plusHours(2);
//        LocalTime localTime2 = localTime.minusMinutes(40);
//        LocalTime localTime3 = localTime.plusSeconds(3600);

//        System.out.println(localTime);
//        System.out.println(localTime1);
//        System.out.println(localTime2);
//        System.out.println(localTime3);

//        LocalTime localTime4 = LocalTime.MAX;
//        System.out.println(localTime4);

    /**
     * Инициализируй шесть статических переменных:
     * <p>
     * в timeMax запиши максимально возможное время;
     * в timeMin запиши минимально возможное время;
     * в time1 запиши время 14 часов ровно;
     * в time2 запиши время 7 часов 8 секунд;
     * в time3 запиши время 0 часов 45 минут 61 наносекунда;
     * в time4 запиши время 14 часов 45 секунд 1001 наносекунда.
     * В методе main() создай объект LocalTime, используя часы из time1 (time1.getHour()),
     * минуты из time2, секунды из time3, наносекунды из time4. Выведи его в консоль.
     */
//    static LocalTime timeMax = LocalTime.MAX;
//    static LocalTime timeMin = LocalTime.MIN;
//    static LocalTime time1 = LocalTime.of(14,0);
//    static LocalTime time2 = LocalTime.of(7,0,8);
//    static LocalTime time3 = LocalTime.of(0,45,0,61);
//    static LocalTime time4 = LocalTime.of(14,0,45,1001);
//
//    public static void main(String[] args) {
//        LocalTime time = LocalTime.of(time1.getHour(),time2.getMinute(),time3.getSecond(),
//                time4.getNano());
//        System.out.println(time);
//    }
    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);

        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    static LocalTime amazingMethod(LocalTime base) {
        return base.plusHours(6);
    }
}
