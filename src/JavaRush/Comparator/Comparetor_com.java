package JavaRush.Comparator;

import JavaRush.Stream_.Car;
import Test.StackTrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class Comparetor_com {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };

//        Comparator<String> comparator = (String o1, String o2) -> {
//            return o1.length() - o2.length();
//        };
//        Collections.sort(list,comparator);

//        Collections.sort(list,(String o1, String o2) -> {
//            return o1.length() - o2.length();
//        }
//        );

//        Comparator<String> comparator = (o1,o2) ->
//                o1.length() - o2.length();
//        Collections.sort(list,comparator);

//        Collections.sort(list,(o1,o2) -> o1.length() - o2.length());


//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "Привет", "как", "дела?");

//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
//           ||
//        Comparator<String> comparator = (String o1,String o2) -> {
//            return o1.length() - o2.length();
//        };
//
//        Collections.sort(list, comparator);
//         ||
//        Collections.sort(list,(String o1, String o2) ->{
//            return  o1.length() - o2.length();
//        });
//        ||
//        Collections.sort(list, (o1,o2) -> o1.length() - o2.length());
//        ||
//            list.sort((o1,o2) -> o1.length() - o2.length());
//
//        list.forEach(System.out::println);

    /**
     * Поиск строки максимальной длины
     */
//        ArrayList<String> list = new ArrayList<String>();
//        Collections.addAll(list, "Привет", "как", "дела?");
//        String max = list.stream().max((s1,s2) -> (s1.length() - s2.length())).get();
//        System.out.println(max);

    /**
     * В этой задаче тебе нужно реализовать два метода так, чтобы:
     * <p>
     * Публичный статический метод getStreamFromArrayList(ArrayList<String>) возвращал поток строк из списка строк, полученного в качестве аргумента.
     * Публичный статический метод getStreamFromArray(Integer[] array) возвращал поток чисел из массива чисел, полученного в качестве аргумента.
     */
//    public static void main(String[] args) {
//        var strings = new ArrayList<String>();
//        Collections.addAll(strings, "Зима", "Весна", "Лето", "Осень");
//
//        Stream<String> stringStream = getStreamFromArrayList(strings);
//        stringStream.forEach(System.out::println);
//
//        var integers = new Integer[]{12, 34, 56, 78, 90};
//
//        Stream<Integer> integerStream = getStreamFromArray(integers);
//        integerStream.forEach(System.out::println);
//    }
//
//    public static Stream<Integer> getStreamFromArray(Integer[] array) {
//        return Arrays.stream(array);
//    }
//
//    public static Stream<String> getStreamFromArrayList(ArrayList<String> list) {
//        return list.stream();
//    }

    /**
     * овременный мир отказывается от двигателей внутреннего сгорания, и эра электрокаров
     * не за горами. Нужно, чтобы наша программа могла отфильтровать электрокары от всех
     * остальных автомобилей.
     * Для этих целей есть метод onlyElectricCars(ArrayList<Car>), который фильтрует список
     * автомобилей, получаемых в качестве входящего параметра. Этот метод возвращает поток
     * отфильтрованных данных, а именно — поток автомобилей, у которых поле isElectric равно
     * true. В этом тебе поможет метод filter() объекта типа Stream<Car>.
     */
    public static void main(String[] args) {
        var cars = new ArrayList<Car>();
        Collections.addAll(cars,
                new Car("Range Rover", false),
                new Car("Model S", true),
                new Car("Navigator", false),
                new Car("Model 3", true),
                new Car("Camaro", false),
                new Car("Escalade", false),
                new Car("Mustang", false),
                new Car("Model X", true),
                new Car("X5", false),
                new Car("Model Y", true));

        var carStream = onlyElectricCars(cars);
        carStream.forEach(System.out::println);
    }

    public static Stream<Car> onlyElectricCars(ArrayList<Car> cars) {
        //напишите тут ваш код
        return cars.stream().filter(Car::isElectric);
    }
}

