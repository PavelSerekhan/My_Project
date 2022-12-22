package Test;

import java.util.Collections;
import java.util.LinkedList;
//Вся работа с LinkedList сводится к изменению ссылок.
// содержит элементы в виде двусвязного списка
// Это значит, что каждый элемент содержит ссылку на предыдущий
// элемент (previous) и на следующий (next).
// В ArrayList при увеличении списка увеличивался внутренний массив, тут же все происходит проще
//— при добавлении элемента просто меняются пару ссылок.
//происходит добавление в конце списка

public class Linked_List {
    public static void main(String[] args) {
        String str1 = new String("Hello World!");
        String str2 = new String("My name is Pavel");
        String str3 = new String("I love Java!");
        String str4 = new String("I live in Moscow");
        String str5 = new String("Shok");

        LinkedList<String> list = new LinkedList<>();
//        list.add(str1);
//        list.add(str3);
//        list.add(1,str2);
//        System.out.println(list);

//        list.remove(1);
//        System.out.println(list);

        list.addFirst(str5);
        list.addLast(str4);
//        System.out.println(list);

        System.out.println(list.peekLast());
        System.out.println(list.peekFirst());

//        System.out.println(list.pollFirst());
        System.out.println(list);
    }
}
