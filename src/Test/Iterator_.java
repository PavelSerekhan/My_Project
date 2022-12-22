package Test;

import java.util.*;

/**
 * предназначением Iterator является перебор элементов
 * это объект предоставляющий возможность двигаться по коллекции и перебирать элементы
 * <p>
 * Нельзя проводить одновременно итерацию (перебор) коллекции и изменение ее элементов.!!!!без итератора
 *
 * <p>
 * Итератор — это специальный объект у коллекции, который помогает обойти все
 * элементы коллекции и не повторяться.
 *
 * синтаксический сахар: можно обойти коллекцию через ForEACH, там скрытый итератор
 */

public class Iterator_ {
//    public static void main(String[] args) {
//        Set<String> values = new TreeSet<>();
//        values.add("Polina");
//        values.add("Viktoria");
//        values.add("Diana");
//        values.add("Pavel");
//        values.add("Audi");
//        values.add("Mercedes");
//        values.add("Citroen");
//        values.add("7");
//
//        Iterator<String> iterator = values.iterator();     //получение итератора
//        while (iterator.hasNext()){        //hasNext проверяем есть ли дальше элементы:
//            //данный метод позволяет узнать, достигнут ли конец коллекции) hasNext
//            System.out.println(iterator.next());   //next получение след элемента
//        }
//
//    }

//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hello ");
//        list.add("World, ");
//        list.add("It's ");
//        list.add("Amigo!");
//
//        Iterator iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            iterator.next();
//            iterator.remove();// удаление элементов
//        }
//        System.out.println(list.size());
//    }


    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>() {{
            add("Привет");
            add("Hello");
            add("Hola");
            add("Bonjour");
            add("Cialo");
            add("Namaste");
        }};
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String str = iterator.next();
//            System.out.println(str);
//        }
//        for (String s : set){
//            System.out.println(s);
//        }

    }

}
