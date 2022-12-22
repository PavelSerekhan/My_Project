package Lesson;


import java.beans.IntrospectionException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LessonWorkStream {
    public static void main(String[] args) {
//        Stream<Integer> stream = Stream.of(1);// поток из одного элемента
//        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);//поток из переданных элементов
//        Stream<Double> stream2 = Stream.generate(Math::random);
//        Stream<Integer> stream3 = Stream.of(10, 11, 12, 13, 14);
//        Stream<Integer> result = Stream.concat(stream1, stream3);//объединяет два потока, сначала
//        читается первый поток
//        Stream<Integer> stream4 = stream.filter(x -> (x < 3));//Оставляем только числа меньше 3

//        Stream<Integer> stream5 = Stream.of(1, -2, -5, -3, 3);
//        Stream<Integer> stream6 = stream5.filter(x -> (x > 0));//Оставляем только числа больше 0

//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
//        Stream<String> stream1 = stream.map(String::valueOf);//Integer in String
//        Stream<Integer> stream2 = stream1.map(Integer::parseInt);//String in Integer

//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "https://google.com", "https://linkedin.com",
//                "https://yandex.com");
//
//        Stream<URI> stream = list.stream().map(str ->
//        {
//            try {
//                return new URI(str);
//            } catch (URISyntaxException e) {
//                e.printStackTrace();
//                return null;
//            }
//        });

        //allMatch все элементы в потоке соответствуют правилу

//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
//        boolean result = stream.allMatch(x -> x > 0);
//        System.out.println(result);

//        Stream<Integer> stream1 = Stream.of(1, -2, 3, -4, 5);
//        boolean result1 = stream1.allMatch(x -> x > 0);
//        System.out.println(result1);

//        Stream<Integer> stream2 = Stream.of(1, -2, 3, -4, 5);
//        boolean result2 = stream2.filter(x -> x < 0).allMatch(x -> x < 0);
//        System.out.println(result2);


        //anyMatch в потоке есть хотя бы один элемент

//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
//        boolean result = stream.anyMatch(x -> x > 0);
//        System.out.println(result);
//
//        Stream<Integer> stream1 = Stream.of(1, -2, 3, -4, 5);
//        boolean result1 = stream1.anyMatch(x -> x > 0);
//        System.out.println(result1);

//        Stream<Integer> stream2 = Stream.of(1, -2, 3, -4, 5);
//        boolean result2 = stream2.filter(x -> x < 0).anyMatch(x -> x > 0);
//        System.out.println(result2);

//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "Привет", "как", "дела?");

//        Stream<String> stream = list.stream();
//        Optional<String> result = stream.findFirst();
//        String str = result.get();//Привет
//        System.out.println(str);
        //or
//        String str = list.stream().findFirst().get();
//        System.out.println(str);
//        String min = list.stream().min( (s1, s2) -> s1.length() - s2.length() ).get();
//        System.out.println("Minimal " + min);
//        String max = list.stream().max( (s1,s2) -> s1.length() - s2.length()).get();
//        System.out.println(max);

//        ArrayList<String> list = new ArrayList<String>();
//        Collections.addAll(list, "Привет", "как", "дела?");
//
//        List<String> result = list.stream()
//                .filter(s -> Character.isUpperCase(s.charAt(0)))
//                .collect(Collectors.toList());

//        ArrayList<String> list = new ArrayList<String>();
//        Collections.addAll(list, "Привет", "как", "дела?");
//
//        Set<String> result = list.stream()
//                .filter( s -> Character.isUpperCase(s.charAt(0)) )
//                .collect( Collectors.toSet() );

//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "a=2", "b=3", "c=4", "d==3");
//
//        String result = list.stream().collect(Collectors.joining(", "));
        //преобразование всех элементов потока к тику String и склеивает из в одну строку

//        Map<String, String> result = list.stream()
//                .map(e -> e.split("="))//(MAP)мы преобразовываем каждую строку в массив строк
//                //(split) делим каждую строку на 2 части по символу =
//                .filter(e -> e.length == 2)//пропускаем через фильтр элементы, кот содержат 2 эл.
//                // d==3 был разбит на 3 элемента
//                .collect(Collectors.toMap(e -> e[0], e -> e[1]));//превращаем поток в MAP,передаются
//        //2 функции, первая функция вернет ключ(a,b,c),2 вернет значение(2,3,4)


        Stream<Integer> stream;
        Stream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x < 300)
                .map(x -> x + 11)
                .limit(3)
                .forEach(System.out::print);

    }
}
