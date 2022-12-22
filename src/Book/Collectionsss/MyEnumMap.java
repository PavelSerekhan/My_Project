package Book.Collectionsss;

import java.util.EnumMap;
import java.util.Iterator;

/**
 * реализуется в виде массива значений
 */
public class MyEnumMap {
    public static void main(String[] args) {
        EnumMap<Weekday,Employee> personInCharge = new EnumMap<>(Weekday.class);
        personInCharge.put(Weekday.FRIDAY, new Employee("Pavel Serekhan"));
        personInCharge.forEach((k,v) -> System.out.println("key = " + k + ", value = " + v));
    }
}
