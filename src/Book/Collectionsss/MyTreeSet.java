package Book.Collectionsss;

import java.util.TreeSet;

/**
 * выводит отсортированные элементы
 */
public class MyTreeSet {
    public static void main(String[] args) {
        var sorted = new TreeSet<String>();
        sorted.add("Bob");
        sorted.add("Amy");
        sorted.add("Carl");
//        for (String s : sorted){
//            System.out.println(s);
//        }
        sorted.forEach(System.out::println);
    }
}

