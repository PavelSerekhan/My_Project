package JavaRush;

import java.util.Objects;

/**
 * Все классы унаследованы от класса OBJECT. А если некий класс унаследован от класса
 * Object, в этом классе-наследнике появляются все методы класса Object.
 * Это и есть главный эффект наследования.
 */
public class ClassObject {

    String name;
    int age;


    public static void main(String[] args) {
        Object a = 5;
        Object b = 5;
        Object s = "stroka";
        System.out.println(a.equals(b));
        System.out.println(s.equals(a));
    }
}
