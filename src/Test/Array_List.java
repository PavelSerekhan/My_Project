package Test;

import javax.sound.sampled.DataLine;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Вся работа с ArrayList (по большому счету) сводится к работе с внутренним массивом.
 * это аналог массива, но со способностью динамически расширяться.
 * он хранит элементы во внутреннем массиве (его размер по умолчанию — 10 ячеек)
 * Когда внутренний массив заполняется, создается новый массив,
 * размер которого определяется по формуле: <размерТекущегоМассива> * 3 / 2  + 1/
 * Далее в него копируются все значения из первого (старого) массива c помощью нативного метода
 * System.arraycopy(), и первый массив удаляется.
 * добавление элементов идет в конец массива
 * <p>
 * Он умеет:
 * хранить элементы определенного типа
 * динамически менять размер списка
 * добавлять элементы в конец списка
 * вставлять элементы в начало и середину списка
 * удалять элементы из любого места списка
 */
public class Array_List {

//    public static void main(String[] args) {
//
//        ArrayList<Cat> cats = new ArrayList<>();
//        Cat thomas = new Cat("Томас");
//        Cat behemoth = new Cat("Бегемот");
//        Cat philipp = new Cat("Филипп Маркович");
//        Cat pushok = new Cat("Пушок");
//
//        cats.add(thomas);
//        cats.add(behemoth);
//        cats.add(philipp);
//        cats.add(pushok);
//        cats.add(new Cat("Enot"));

//        cats.set(0,new Cat("Vasia"));
//        cats.add(0, new Cat("Vasia"));
//        System.out.println(cats);
//        System.out.println(cats.size());


//        int thomasIndex = cats.indexOf(thomas);
//        cats.remove(3);
//        System.out.println(thomasIndex);
//        System.out.println(cats.indexOf(pushok));
//        System.out.println(cats.get(3));
//        System.out.println(cats.contains("plia"));
//        System.out.println(cats.contains(philipp));
//        System.out.println(cats.indexOf(philipp));

    /**
     * В классе Solution есть список сотрудников waitingEmployees,
     * которые ждут зарплату, и список сотрудников alreadyGotSalaryEmployees, которые её
     * уже получили. Необходимо реализовать метод paySalary(String), который в качестве
     * аргумента принимает имя сотрудника, желающего получить зарплату.
     * Метод должен проверить наличие сотрудника в списке waitingEmployees, и если он
     * не получал зарплату, выдать её:
     * Если параметр метода paySalary(String) равняется null, ничего не нужно делать.
     * Добавить имя сотрудника в список alreadyGotSalaryEmployees.
     * В списке waitingEmployees заменить имя сотрудника на null.
     */
//    public static ArrayList<String> waitingEmployees = new ArrayList<>();
//    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();
//
//    public static void initEmployees() {
//        waitingEmployees.add("Гвинно");
//        waitingEmployees.add("Гунигерд");
//        waitingEmployees.add("Боргелейф");
//        waitingEmployees.add("Нифрод");
//        waitingEmployees.add("Альбиуф");
//        waitingEmployees.add("Иногрим");
//        waitingEmployees.add("Фриле");
//    }
//
//    public static void main(String[] args) {
//        initEmployees();
//    }
//
//    public static void paySalary(String name) {
//        if (waitingEmployees.contains(name) && name != null){
//            alreadyGotSalaryEmployees.add(name);
//            waitingEmployees.set(waitingEmployees.indexOf(name), null);
//
//        }
//    }


//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                list.add(i);
//            }
//        }
//        for (int j = 0; j < list.size(); j++) {
//            if (list.get(j) % 4 == 0) {
//                list.remove(j);
//                j--;
//            }
//            System.out.print(list.get(j) + " ");
//        }
//
//    }


//   ` public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(list);
//
//        list.add(1,9); // сдвигает весь list
//        System.out.println(list);
//
//        System.out.println(list.get(1));
//        list.set(0,8);
//        System.out.println(list);
//
//        list.remove(5);
//        System.out.println(list);
//
//        System.out.println(list.contains(9));
//    }


//    public static ArrayList<String> planets = new ArrayList<>();
//    public static void main(String[] args) {
//        addPlanets();
//        print();
//        createNewPlanet("Звезда Смерти");
//        print();
//    }
//    public static void createNewPlanet(String planetName){
//        planets.add(3, planetName);
//    }
//    public static void addPlanets() {
//        planets.add("Меркурий");
//        planets.add("Венера");
//        planets.add("Земля");
//        planets.add("Марс");
//        planets.add("Юпитер");
//        planets.add("Сатурн");
//        planets.add("Уран");
//        planets.add("Нептун");
//    }
//
//    public static void print() {
//        for (int i = 0; i < planets.size(); i++) {
//            System.out.println(String.format("%s - %d - я планета от Солнца",
//                    planets.get(i), (i + 1)));
//        }
//        System.out.println();
//    }


//    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList(
//            "C", "C++", "Python", "JavaScript",
//            "Ruby", "Java", "Pascal"));
//
//    public static void main(String[] args) {
////        programmingLanguages.remove("Pascal");
////        System.out.println(programmingLanguages);
//
//        Iterator<String> iterator = programmingLanguages.iterator();
//        while (iterator.hasNext()){
//           String pr = iterator.next();
//            if (pr.equals("Pascal")){
//                iterator.remove();
//            }
//        }
//        System.out.println(programmingLanguages);

//        for (int i = 0; i < programmingLanguages.size(); i++) {
//            if (programmingLanguages.get(i).equals("Pascal")){
//                programmingLanguages.remove(i);
//            }
//            System.out.println(programmingLanguages);
//        }
//    }


//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i <= 20 ; i++) {
//            if (i % 2 == 0){
//                list.add(i);
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 4 == 0){
//                list.remove(i);
//                i--;
//            }
//        }
//        System.out.println(list);
//    }

//    private static ArrayList<String> initList() {
//        String glassTop = "       🍷       ";
//        String glassSecond = "      🍷🍷      ";
//        String glassThird = "     🍷🍷🍷     ";
//        String glassFourth = "    🍷🍷🍷🍷    ";
//        String glassFifth = "   🍷🍷🍷🍷🍷   ";
//        String glassSixth = "  🍷🍷🍷🍷🍷🍷  ";
//        String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
//        String glassEighth = "🍷🍷🍷🍷🍷🍷🍷🍷";
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add(glassEighth);
//        list.add(glassSeventh);
//        list.add(glassSixth);
//        list.add(glassFifth);
//        list.add(glassFourth);
//        list.add(glassThird);
//        list.add(glassSecond);
//        list.add(glassTop);
//        return list;
//    }
//
//    public static void print(ArrayList<String> glasses) {
//        for (int i = glasses.size() - 1; i >= 0; i--) {
//            System.out.println(glasses.get(i));
//        }
//    }
//
//    public static void removeGlassesReverse(ArrayList<String> glasses) {
//        System.out.println("Начинаем разбирать пирамиду...");
//        //напишите тут ваш код
//        for (int i = glasses.size() - 1; i >= 0; i--){
//            glasses.remove(i);
//        }
//        if (glasses.size() == 0) {
//            System.out.println("Пирамида разобрана!");
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<String> glasses = initList();
//        print(glasses);
//
//        removeGlassesReverse(glasses);
//        print(glasses);
//    }


//    public static void main(String[] args) {

//        Integer a = 5;
//        int b = a;
//        var str = "Hello";
//        var s = 5;
//        var list = new ArrayList<String>();


//        var string = new ArrayList<String>() {{
//            add("Так");
//            add("тоже");
//            add("можно");
//            add("делать");
//            add("!");
//        }};
//    }
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);

        removeBugWithWhile(copyWordsSecond);

        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);

        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);

        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase("bug")) {
                list.remove(list.get(i));
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        //напишите тут ваш код
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equalsIgnoreCase("bug")) {
                iterator.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> each = new ArrayList<>(list);

        for (String str : each) {
            if (str.equalsIgnoreCase("bug")) {
                list.remove(str);
            }

        }
    }
}

