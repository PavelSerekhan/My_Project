package Book.Collectionsss;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        var a = new LinkedList<String>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        var b = new LinkedList<String>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        //объединить слова из списков а и б
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();
        while (bIter.hasNext()){
            if (aIter.hasNext())
                aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);

        //удалить каждое второе слово из списка б
//        bIter = b.iterator();
//        while (bIter.hasNext()){
//            bIter.next(); //пропускаем элемент
//            if (bIter.hasNext()){
//                bIter.next(); //пропускаем элемент
//                bIter.remove(); //удаляем данный элемент
//            }
//        }
//        System.out.println(b);

        //групповая операция удаления из связного списка а, всех слов, составляющий список b
        a.removeAll(b);
        System.out.println(a);
    }
}
