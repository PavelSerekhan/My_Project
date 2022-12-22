package JavaRush;

import com.sun.source.tree.BreakTree;

public class ClassStringFormat {
    public static void main(String[] args) {
//        String name = "Pavel";
//        int age = 32;
//        int width = 20;
//        int height = 10;
//        String FullName = "Diego";

//        String result = String.format("Age=%d, Name=%s", age, name);

//        System.out.printf("Age = %d, Name = %s " , age, name);
//        System.out.printf("Width = %d, Height =%d ", width, height);
//        System.out.printf("Fullname =%s" , FullName);
//    }


        /**
         * Сделай так, чтобы метод format(String name, int salary) возвращал строку в таком виде:
         * Меня зовут <name>. Я буду зарабатывать $<salary> в месяц.
         *
         * Для этого используй метод String.format().
         */

//        System.out.println(format("Амиго", 5000));
//    }
//    public static String format(String name, int salary) {
//        String phrase = String.format("Меня зовут %s. Я буду зарабатывать %d$ в месяц.",name,salary);
//        return phrase;
//    }

        /**
         * Метод equal(String, String) сравнивает строки по ссылке, используя оператор ==.
         * Нужно сделать так, чтобы метод возвращал true, если содержимое строк одинаковое,
         * и false — если разное, не используя метод equals().
         */
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }
    public static boolean equal(String first, String second) {
        //напишите тут ваш код
        String t1 = first.intern();
        String t2 = second.intern();
        if (t1 == t2) {
            return true;
        }
            return false;
        }
    }

