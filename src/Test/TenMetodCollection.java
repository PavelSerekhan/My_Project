package Test;

import java.util.*;

public class TenMetodCollection {

    public static void main(String[] args) {
/**
 *        1. Iterable.forEach
 * Перебирает переданную коллекцию, и выполняет лямбда-выражение action для каждого ее элемента.
 */
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//        numbers.forEach(s -> System.out.print(s + " "));
/**
 * 2. Collection.removeIf
 * Метод перебирает коллекцию, и удаляет те элементы, которые соответствуют filter.
 */
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.removeIf(s -> s > 5);
//        list.forEach(s -> System.out.print(s + " "));
/**
 * 3. Map.forEach
 */
        Map<String,String> books = new HashMap<>();
        books.put("Война и мир", "Лев Толстой");
        books.put("Преступление и наказание", "Федор Достоевский");
        books.put("Философия Java", "Брюс Эккель");
        books.put("Братья Карамазовы", "Федор Достоевский");
        books.put("Властелин Колец", "Джон Толкин");
        books.forEach((a,b) -> System.out.println("Название книги: " + a + ". Автор: " +b));

        /**8. Map.merge
         *
         */
        Map <String, String> bookss = new HashMap<>();
        bookss.put("Война и мир", "Лев Толстой");
        bookss.put("Преступление и наказание", "Федор Достоевский");
        bookss.put("Философия Java", "Брюс Эккель");
        bookss.put("Братья Карамазовы", "Федор Достоевский");
        bookss.put("Властелин Колец", "Джон Толкин");

        bookss.merge("Философия Java", "Брюс Эккель", (a, b) -> b +  " и кто-то там еще");
        bookss.forEach((a,b) -> System.out.println("Название:" + a + ". Автор: " + b));

        /**
         * 9. Map.putIfAbsent
         * Раньше чтобы добавить пару в Map, если ее там нет, необходимо было делать следующее:
         */
//        Map<String,String > maps = new HashMap<>();
//        if (maps.get("Властелин Колец") == null){
//            maps.put("Властелин Колец", "Джон Толкин");
//        }
        /**
         * Теперь все стало куда проще:
         */
        Map<String ,String> maps = new HashMap<>();
        maps.putIfAbsent("Властелин Колец", "Джон Толкин");
    }

}
