package Generic_Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic - параметризация
 * List<Generic> list = new ArrayList<>;
 *  более сильная проверка типов во время компиляции
 *  устранение необходимости явного приведения.
 */
public class TestGeneric {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Cat");
        list.add("Dog");
        list.add("Frog");

//        String animal = (String) list.get(1); //устранение необходимости явного приведения.
        String animal = list.get(1);
        System.out.println(animal);
    }
}



