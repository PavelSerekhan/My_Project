package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//хранит множество пар элементов, каждая пара: ключ и значение.
//Ключи должны быть уникальные: одна карта не может содержать два одинаковых ключа.

/**
 * HashMap имеет переопределенный метод toString()
 */
public class Hash_Map {
//        public static void main(String[] args) {

//            HashMap<Key,Value> map = new HashMap<Key, Value>();

//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Serega", 21);
//        map.put("Nikolai", 22);
//        map.put("Ivan Petrovich", 48);
//        map.put("Ania", null);
//
//        for (String key : map.keySet()){
//            Integer value = map.get(key);
//            System.out.println(key + "-->" + value);
//        }
//    }

//    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(0,"Привет");
//        map.put(1,"Hello");
//        String s = map.get(0);
//        map.put(0,s + "!");
//        for (String item : map.values()){
//            System.out.println(item);
//        }
//
//
//    }

    /**
     * В классе Solution объявлено поле grades типа HashMap<String, Double>,
     * где ключ — имя и фамилия студента, а значение - его средняя оценка. На этот раз
     * твоя задача — реализовать методы:
     * printStudents, который выводит только имена всех студентов (ключ коллекции);
     * getAverageMark, который возвращает средний балл всех студентов.
     */
    public static HashMap<String, Double> grades = new HashMap<>();
//
//    public static void main(String[] args) {
//        addStudents();
//        System.out.println("Список студентов группы: ");
//        printStudents();
//        System.out.print("Средний балл группы: " + getAverageMark());
//        printStudentInfo();

//        for (String key : grades.keySet()){
//            System.out.println(grades.get(key));
//        }
//    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }


//    public static void printStudents() {
//        //напишите тут ваш код
//        for (String key : grades.keySet()) {
//            System.out.println(key);
//        }
//        for (Double value : grades.values()){
//            System.out.println(value);
//        }
//    }

//    public static Double getAverageMark() {
//        //напишите тут ваш код
//        double value = 0;
//        for (Double val : grades.values()) {
//            value += val;
//        }
//        return value / grades.size();
//    }
//
//    public static void printStudentInfo() {
//        Set<Map.Entry<String,Double>> entries = grades.entrySet();
//        for (Map.Entry<String,Double> pair : entries){
//            String key = pair.getKey();
//            Double value = pair.getValue();
//            System.out.println(key + " : " + value);
//        }
//            ||
//        for (Map.Entry<String,Double> pair : grades.entrySet()){
//            String key = pair.getKey();
//            Double value = pair.getValue();
//            System.out.println(key + " : " + value);
//        }
    //   ||
//        for (var pair : grades.entrySet()) {
//            String key = pair.getKey();
//            Double value = pair.getValue();
//            System.out.println(key + " : " + value);
//        }


    public static void main(String[] args) {
        HashMap<Integer, String> passportName = new HashMap<>();

        passportName.put(212133, "Лидия Аркадьевна Бубликова");
        passportName.put(162348, "Иван Михайлович Серебряков");
        passportName.put(8082771, "Дональд Джон Трамп");
//        System.out.println(passportName);

        System.out.println(passportName.get(162348));
        passportName.remove(162348);
//        System.out.println(passportName.containsKey(11111));
//        System.out.println(passportName.containsValue("Дональд Джон Трамп"));

        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();
        passportsAndNames2.put(917352, "Алексей Андреевич Ермаков");
        passportsAndNames2.put(925648, "Максим Олегович Архаров");

        passportName.putAll(passportsAndNames2); // Объединение двух мап в одну

        System.out.println(passportName);
    }
}

