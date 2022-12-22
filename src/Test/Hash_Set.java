package Test;

import javax.imageio.ImageTranscoder;
import java.util.*;

/*
тип множество. Коллекция Set создана для хранения множества элементов.
Во многом он похож на класс ArrayList, и в каком-то смысле является его более примитивной версией.
3 особенности:
Операции над множеством: добавлять элементы, удалить,проверять, есть ли во множестве опр элемент.

Отсутствие порядка: У элементов этой коллекции нет номеров.
 Нельзя получить элемент по его индексу
или записать значение в коллекцию по определенному индексу.
 Методов get() и set() у множества нет.
Уникальность элементов: В отличие от списка, в множестве один элемент может быть только раз.

Поиск элементов
Когда вы добавляете во множество новый элемент, удаляете элемент, или проверяете наличие элемента,
внутри метода выполняется поиск элемента. Элементы коллекции и переданный элемент сравниваются
сначала по hashCode(), а если hashCode() совпадают, по equals.
 */

/**
 * Операции над множеством: добавлять,удалять,проверять.
 * Отсутствие порядка: нет номеров.(методов get и set нету!).
 * Уникальность элементов: один элемент может быть только раз.
 * Поиск элементов: Элементы коллекции и переданный элемент сравниваются сначала по hashCode(),
 * а если hashCode() совпадают, по equals.
 */
public class Hash_Set {

//    public static void main(String[] args) {
//
//        HashSet<String> set = new HashSet<>();
//
//        set.add("Hello");
//        set.add("Iks");
//        set.add("Pavel");
//
//        set.remove("Pavel");
//
//        if (set.contains("Iks")){
//            System.out.println(true);
//        }
//        //set.clear();
//        System.out.println(set.size());
//    }

    //    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>(); //создание
//        Collections.addAll(set,"Привет","Hello","Hola","Bonjour","Cialo","Namaste");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        if (set.contains(str)){ //Проверяет, есть ли в коллекции элемент str
//            System.out.println("Да спаткання!");
//        }
//    }
//    public static void main(String[] args) {
//        HashSet<String> h = new HashSet<>();
//        h.add("India");
//        h.add("Australia");
//        h.add("South Africa");
//        h.add("India");
//        System.out.println(h);
////        System.out.println("Лист содержит India или нет: " + h.contains("India"));
////        h.remove("Australia");
////        System.out.println("Лист после удаления Australia: " + h);
//        System.out.println("Iterator over list: ");
//        Iterator<String> i = h.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//    }

//    public static void main(String[] args) {
//
//        HashSet<String> set = new HashSet<>() {{
//            add("Привет");
//            add("Hello");
//            add("Hola");
//            add("Bonjour");
//            add("Cialo");
//        }};
//
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        if (set.contains(str)) {
//            System.out.println("Да спаткання!");
//        }
//    }

//    public static void main(String[] args) {
//        String[] array = {"Через", "три", "года", "я", "буду",
//                "Senior", "Java", "Developer"};
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println("___________________________________");
//
//        HashSet<String> hashSet = arrayToHashSet(array);
//        for(String s : hashSet) {
//            System.out.println(s);
//        }
//    }
//    public static HashSet<String> arrayToHashSet(String[] strings) {
//        //напишите тут ваш код
//        HashSet<String> set = new HashSet<>(Arrays.asList(strings));
//        return set;
//    }

//    public static HashSet<String> words = new HashSet<>(Arrays.asList
//            ("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));
//
//    public static void checkWords(String word) {
//        //напишите тут ваш код
//        if (words.contains(word)) {
//            System.out.println("Слово " + word + " есть в множестве");
//        } else {
//            System.out.println("Слова " + word + " нет в множестве");
//        }
//    }
//
//    public static void main(String[] args) {
//        checkWords("JavaScript");
//        checkWords("Java");
//    }


    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");
        System.out.println(h);
    }

}
