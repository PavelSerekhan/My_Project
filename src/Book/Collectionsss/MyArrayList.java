package Book.Collectionsss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MyArrayList {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        Collections.addAll(list, "Pavel", "Polina", "Viktoria", "Diana");

        System.out.println(containst(list,"Pavel"));

//        list.forEach(System.out::println);

//        for(String lists : list){
//            System.out.println(lists);
//        }

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String item = iterator.next();
//            if (item.equals("Pavel")){
//                iterator.remove();
//            }
//        }
//        ||
//        list.removeIf(item -> item.equals("Pavel"));//удаление элемента по заданному условию
//        list.forEach(System.out::println);


//        iterator.forEachRemaining(System.out::println);
    }

//обобщенный метод для коллекций находящий объект
    public static <E> boolean containst(Collection<E> c, Object obj) {
        for (E element : c) {
            if (element.equals(obj))
                return true;
        }
        return false;
    }
}
