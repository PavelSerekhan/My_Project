package Book.Collectionsss;

import java.util.EnumSet;

/**
 * реализован в виде битовой последовательности, бит устанавливается, если соответствующее
 * значение  перечисления присутствует во множестве.
 */
public class MyEnumSet {
    public static void main(String[] args) {
        EnumSet<Weekday> always = EnumSet.allOf(Weekday.class); //все
        EnumSet<Weekday> never = EnumSet.noneOf(Weekday.class);

        // range - диапазон
        EnumSet<Weekday> workDay = EnumSet.range(Weekday.MONDAY,Weekday.FRIDAY);

        //добавить определенные
        EnumSet<Weekday> mwf = EnumSet.of(Weekday.MONDAY,Weekday.WEDNESDAY,Weekday.FRIDAY);
//        always.forEach(System.out::println);
//        never.forEach(System.out::println);
//        workDay.forEach(System.out::println);
        mwf.forEach(System.out::println);
    }
}
