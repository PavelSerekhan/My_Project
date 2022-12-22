package Book.Collectionsss;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedList_Iterator {
    public static void main(String[] args) {

        var staff = new LinkedList<String>();  // staff - сотрудник
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");

//        Iterator<String> iterator = staff.iterator();
//        String first = iterator.next(); //обратиться к первому элементу
//        String second = iterator.next();//обратиться ко второму элементу
//        iterator.remove();  //удалить последний перебираемый элемент списка
//        staff.forEach(System.out::println);

//        ListIterator<String> iter = staff.listIterator();
//        iter.next(); //пропустить первый элемент списка
//        iter.add("Juliet");
//        iter.add("---");
//        iter.add("---");
//        iter.previous();
//        iter.remove();
//        staff.forEach(System.out::println);

//        ListIterator<String> iterator = staff.listIterator();
//        String ojdValue = iterator.next(); //возвращает первый элемент списка
//        iterator.set("newValue"); // устанавливает в первом элементе новое значение

        ListIterator<String> iterator = staff.listIterator();
        iterator.next();
        iterator.next();
        System.out.println(iterator.nextIndex());


    }
}
