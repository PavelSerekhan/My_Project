package Book.Lambda;

import Book.Comparator_interface.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import static java.util.Comparator.reverseOrder;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Person("Andrei", "Barbara", 32);
        people[1] = new Person("Andrei", "Barbara", 25);
        people[2] = new Person("Pasha", "Sakovich", 41);
        people[3] = new Person("Igor", "Kazuko", 33);

//        Arrays.sort(people, Comparator.comparing(Person::getName));
//
//        Arrays.sort(people, Comparator
//                .comparing(Person::getName)
//                .thenComparing(Person::getLastName));
//
//        Arrays.sort(people, Comparator
//                .comparing(Person::getName)
//                .thenComparing(Person::getLastName)
//                .thenComparing(Person::getAge));

        Arrays.sort(people,Comparator.comparing(Person::getName,     //по длине имен
                (s,t) -> Integer.compare(s.length(),t.length())));
        //   ||
//        Arrays.sort(people,Comparator.comparingInt(     //по длине имен
//                p -> p.getName().length()));

        for (Person e : people)
            System.out.println(e);

    }
}
