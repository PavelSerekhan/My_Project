package JavaRush.Stream_.JavaRushStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * метода collect(), используется для того, чтобы перейти от потоков
 * к привычным коллекциям — List<T>, Set<T>, Map<T, R> и другим.
 */
public class ClassCollectors {

    /**
     * Преобразование потока в список
     */
//    public static void main(String[] args) {
//
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"Привет", "ак", "дела?");
//
//        List<String> result = list.stream()
//                .filter(s -> Character.isUpperCase(s.charAt(0)))
//                .collect(Collectors.toList());
//
//        result.forEach(System.out::println);
//    }

    /**
     * Для решения этой задачи необходимо, чтобы метод getPositiveNumbers(Stream<Integer>)
     * преобразовывал входящий поток чисел в список чисел больше нуля.
     * Реализуй его, используя метод collect() объекта типа Stream<Integer>.
     * В качестве параметра передай нужный коллектор (объект типа Collector<List<Integer>>).
     * Такой объект можно получить, вызвав статический метод toList() класса Collectors.
     */
//    public static void main(String[] args) {
//        var numbers = Stream.of(-1, 10, 43, 0, -32, -4, 22);
//
//        getPositiveNumbers(numbers).forEach(System.out::println);
//    }
//    public static List<Integer> getPositiveNumbers(Stream<Integer> numbers) {
//        return numbers.filter(x -> x > 0).collect(Collectors.toList());
//    }

    /**
     * Преобразование потока во множество
     */
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"Привет", "как", "дела?");
//
//        Set<String> set = list.stream()
//                .filter(x -> Character.isUpperCase(x.charAt(0)))
//                .collect(Collectors.toSet());
//    }

    /**
     * Необходимо, чтобы метод getFilteredStrings(Stream<String>) преобразовывал
     * входящий поток строк во множество строк, длина которых больше шести символов.
     * Реализуй его, используя метод collect() объекта типа Stream<String>.
     * В качестве параметра передай нужный коллектор (объект типа Collector<Set<String>>).
     * Такой объект можно получить, вызвав статический метод toSet() класса Collectors.
     */
//    public static void main(String[] args) {
//        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo",
//                "Elly", "Kim", "Risha");
//
//        getFilteredStrings(stringStream).forEach(System.out::println);
//    }
//
//    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
//        //напишите тут ваш код
//        return stringStream.filter(x -> x.length() > 6).collect(Collectors.toSet());
//    }

    /**
     * Преобразование потока в мэп
     */
//    public static void main(String[] args) {
//
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "a=2", "b=3", "c=4", "d==3");
//
//        Map<String, String> result = list.stream()
//                .map(e -> e.split("="))
//                .filter(e -> e.length == 2)
//                .collect(Collectors.toMap(e -> e[0], e -> e[1]));
//
//        System.out.println(result);
//    }
    /**
     * Необходимо, чтобы метод getMap(Stream<String>) преобразовывал входящий поток строк в
     * карту (map), ключом которой является сама строка, а значением — её длина.
     * Реализуй его, используя метод collect() объекта типа Stream<String>. В качестве
     * параметра передай нужный коллектор (объект типа Collector<Map<String, Integer>>).
     * Такой объект можно получить, вызвав статический метод toMap() класса Collectors.
     */
//    public static void main(String[] args) {
//        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly",
//                "Kim", "Risha");
//
//        getMap(stringStream).forEach((s,i) -> System.out.println(s + " - " + i));
//    }
//    public static Map<String, Integer> getMap(Stream<String> stringStream) {
//        //напишите тут ваш код
//
//        return stringStream.map(e -> e.split(" "))
//                .collect(Collectors.toMap(e -> e[0], e -> e[0].length()));
//    }
    /**
     * Преобразование потока в строку
     * Collectors.joining() - преобразовывает все элементы потока к типу String и склеивает
     * их в одну строку
     */
//    public static void main(String[] args) {
//
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"a=2", "b=3", "c=4", "d==3");
//
//        String result = list.stream().collect(Collectors.joining(","));
//        System.out.println(result);
//    }
    /**
     * Необходимо, чтобы метод getString(Stream<String>) преобразовывал входящий поток строк
     * в строку, слова в которой нужно разделить пробелом. Порядок слов в строке должен
     * соответствовать порядку элементов в потоке.
     * Реализуй его, используя метод collect() объекта типа Stream<String>.
     * В качестве параметра передай нужный коллектор (объект типа Collector<String>).
     * Такой объект можно получить, вызвав статический метод joining() класса Collectors.
     */
    public static void main(String[] args) {
        var stringStream = Stream.of("To", "be", "a", "programmer",
                "you", "need", "to", "code");

        System.out.println(getString(stringStream));
    }

    public static String getString(Stream<String> stringStream) {
        //напишите тут ваш код
        return stringStream.collect(Collectors.joining(" "));
    }

}
