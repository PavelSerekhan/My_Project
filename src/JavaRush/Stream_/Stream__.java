package JavaRush.Stream_;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream__ {
//    public static void main(String[] args) {

//        Stream.of(10, 32, -4, 0, 18).sorted().forEach(System.out::println);

//        List<Integer> list = Arrays.asList(10, 23, -4, 0, 18);
//        List<Integer> listSorted = list.stream().sorted().collect(Collectors.toList());
//
//        System.out.println(list);
//        System.out.println(listSorted);
        /**
         * Сортировка списка целых чисел в порядке убывания с помощью Stream.sorted ()
         */
//        List<Integer> list = Arrays.asList(10, 23, -4, 0, 18);
//        List<Integer> listSorted = list.stream()
//                .sorted(Collections.reverseOrder())
//                .collect(Collectors.toList());
//        System.out.println(listSorted);
        /**
         * Сортировка списка строк с помощью Stream.sorted ()
         */
//        List<String> list1 = Arrays.asList("John", "Mark", "Robert", "Lucas", "Brandon");
//        List<String> listSorted1 = list1.stream().sorted().collect(Collectors.toList());
//
//        List<String> listSorted2 = list1.stream()
//                .sorted(Collections.reverseOrder())
//                .collect(Collectors.toList());
//
//        System.out.println(listSorted2);
//        System.out.println(listSorted1);


//        public static void main(String[] args) {
//
//        List<User> list = new ArrayList<>(Arrays.asList(
//                new User("John", 33),
//                new User("Robert", 26),
//                new User("Mark", 26),
//                new User("Brandon", 42)
//        ));
//        List<User> sortedList = list.stream()
//                .sorted(Comparator.comparingInt(User::getAge).reversed())
//                .collect(Collectors.toList());
//
//        sortedList.forEach(System.out::println);
//    }
//
//    static class User {
//        private String name;
//        private int age;
//
//        public User(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        @Override
//        public String toString() {
//            return "User:[ " + name + ", age: " + age + "]";
//        }

    /**
     * Класс Language представляет собой модель языка программирования. В этом классе есть два поля: name - название языка программирования, ranking - рейтинг использования языка программирования по состоянию на сентябрь 2020 года, согласно TIOBE.
     * Нужно, чтобы публичный статический метод sortByRanking(ArrayList<Language>) сортировал полученный список языков программирования по убыванию рейтинга, и возвращал отсортированный поток данных (Stream<Language>).
     */
    public static void main(String[] args) {
        ArrayList<Language> languages = new ArrayList<>();
        Collections.addAll(languages,
                new Language("С#", 4.58),
                new Language("JavaScript", 2.54),
                new Language("Python", 10.47),
                new Language("C++", 7.11),
                new Language("Go", 1.46),
                new Language("R", 2.37),
                new Language("Java", 13.48),
                new Language("C", 15.95),
                new Language("Swift", 1.38),
                new Language("PHP", 2.49));

        Stream<Language> languageStream = sortByRanking(languages);
        languageStream.forEach(System.out::println);
    }

    public static Stream<Language> sortByRanking(ArrayList<Language> languages) {
        //напишите тут ваш код
        return languages.stream()
                .sorted(Comparator.comparingDouble(Language::getRanking).reversed());
    }
}






