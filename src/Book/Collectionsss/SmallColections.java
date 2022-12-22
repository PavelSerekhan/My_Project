package Book.Collectionsss;

import java.util.*;

public class SmallColections {
    public static void main(String[] args) {
        List<String> list = List.of("Peter", "Paul", "Mary"); // получается список

        Set<Integer> numbers = Set.of(2, 3, 5); // получается множество

        Map<String, Integer> scores = Map.of("Peter", 2, "Paul", 3,
                "Mary", 5);

        List<Employee> listik = new ArrayList<>();
        listik.add(new Employee("Pavel"));
        listik.add(new Employee("Margo"));
        listik.add(new Employee("Polina"));
        listik.add(new Employee("Ira"));
        listik.add(new Employee("Diana"));
        listik.add(new Employee("Vova"));

        /**
         * subList - диапазон, извлечение с 1 по 5(не вкл)
         */
        List<Employee> group2 = listik.subList(1, 5);
        System.out.println(group2);
        group2.clear(); // удалится весь диапазон group2 из listika
        System.out.println(listik);
    }
}
