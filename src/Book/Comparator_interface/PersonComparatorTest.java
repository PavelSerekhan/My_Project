package Book.Comparator_interface;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PersonComparatorTest {
    public static void main(String[] args) {
//        PersonComparator personComparator = new PersonComparator();

        Comparator personComparator = Comparator.comparing(Person::getAge).thenComparing(Person::getLastName);

        SortedSet<Person> set = new TreeSet<>(personComparator);
        set.add(new Person("Sasha","Ivanov",32));
        set.add(new Person("Masha","Ivanova",25));
        set.add(new Person("Pasha","Ivanovski", 41));
        set.add(new Person("Igor","Kachko",33));

        set.forEach(System.out::println);

    }
}
