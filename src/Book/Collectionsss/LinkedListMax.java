package Book.Collectionsss;

import java.util.*;

public class LinkedListMax {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        Collections.addAll(list, 1, 2, 33, 4, 33, 6, 7, 33, 9);
        System.out.println(max(list));

        Collections.replaceAll(list, 33, 0);
//        System.out.println(list);

        // Сортировка reversOrder
//        list.sort(Comparator.reverseOrder());
//        System.out.println(list);

        // Сортировка по возрастанию
//        list.sort(Comparator.naturalOrder());
//        System.out.println(list);
    }

// Обобщенный метод Generic T!

    public static <T extends Comparable> T max(Collection<T> c) {
        if (c.isEmpty()) throw new NoSuchElementException();
        Iterator<T> iterator = c.iterator();
        T largest = iterator.next();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (largest.compareTo(next) < 0) {
                largest = next;
            }
        }
        return largest;
    }
}