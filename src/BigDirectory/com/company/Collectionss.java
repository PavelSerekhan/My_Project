package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collectionss {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 1, 2, 3, 4, 5);// заполнение листа числами
//        for (int i : list) {
//            System.out.println(i);
//        }
//        System.out.println();
//
//        Collections.replaceAll(list, 1, 20);// замена значение 1 на значение 20
//        for (int a : list) {
//            System.out.println(a);
//        }
//        System.out.println();
//
//        Collections.fill(list, 10);// заполнение листа элементом 10
//        for (int i : list) {
//            System.out.println(i);
//        }

//        ArrayList<Integer> srcList = new ArrayList<Integer>();
//        Collections.addAll(srcList, 99, 98, 97);
//
//        ArrayList<Integer> destList = new ArrayList<>();
//        Collections.addAll(destList, 1, 2, 3, 4, 5, 6, 7);
//
//        Collections.copy(destList, srcList);//копировать лист
//        for (int c:
//             destList) {
//            System.out.println(c);
//        }

//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 1, 2, 3, 4, 5);
//        Collections.reverse(list);//развернуть лист 5,4,3,2,1
//        for (int a:
//             list) {
//            System.out.println(a);
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 11, 2, 24, 4, 15);
//        Collections.sort(list);//отсортировать по возростанию
//        for (int q : list) {
//            System.out.println(q);
//
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);
//        Collections.rotate(list, 3);//Сдвинуть на 3 позиции
//        for (int a : list){
//            System.out.println(a);
//        }

//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);
//        Collections.shuffle(list);//перемешивать элементы в листе
//        for (int a: list){
//            System.out.println(a);
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 33, 4, 11, 22, 4, 4, 5, 6, 4, 7);
//        int min = Collections.min(list);//поиск min в листе
//        int max = Collections.max(list);//поиск max в листе
//        int count = Collections.frequency(list, 33);//частота повторения 33 в листе
//        System.out.println(min);
//        System.out.println(max);
//        System.out.println(count);

//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 4, 56, 127, 2, 33, 67);
//        Collections.sort(list);
//        for(int a: list){
//            System.out.println(a);
//        }
//        System.out.println();
//        int index = Collections.binarySearch(list,2);//поиск числа в листе, после сортировки
//        System.out.println(index);
//        int index1 = Collections.binarySearch(list, 127);
//        System.out.println(index1);
//        int index2 = Collections.binarySearch(list,3);
//        System.out.println(index2);

//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 1, 2, 3, 4, 5, 6);
//        ArrayList<Integer> list1 = new ArrayList<>();
//        Collections.addAll(list1, 98, 2, 93);
//        boolean isDifferent = Collections.disjoint(list,list1);//возвращает true, если
//        // у переданных коллекций нет одинаковых элементов.
//        System.out.println(isDifferent);

//        String mercury = new String("Меркурий");
//        String venus = new String("Венера");
//        String earth = new String("Земля");
//        String mars = new String("Марс");
//        String jupiter = new String("Юритер");
//        String saturn = new String("Сатурн");
//        String uranus = new String("Уран");
//        String neprune = new String("Нептун");
//        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
//                jupiter, saturn, uranus, neprune));
//        Collections.sort(solarSystem);
//        System.out.println(solarSystem);
//        Collections.reverse(solarSystem);
//        System.out.println(solarSystem);


//        List<String> wordList = Arrays.asList("I", "love","learning"," on","Java");
//        String[] wordsArray = new String[wordList.size()];
//        for (int i = 0; i < wordList.size(); i++) {
//            wordsArray[i] = wordList.get(i);
//        }
//        for (String wordsArrays: wordsArray) {
//            System.out.println(wordsArrays);
//        }

//        List<String> wordList = Arrays.asList("I", "love","learning"," on","Java");
//        String[] wordsArray = new String[wordList.size()];
//        wordList.toArray(wordsArray);
//        for (String word: wordList){
//            System.out.println(word);
//        }

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//        System.out.println(Collections.max(numbers));
//        System.out.println(Collections.min(numbers));
//        Collections.reverse(numbers);
//        System.out.println(numbers);

//        ArrayList<Integer> lottery = new ArrayList<>(100);
//        for (int i = 0; i <= 100; i++) {
//            lottery.add(i);
//        }
//        Collections.shuffle(lottery);
//        System.out.println("Внимание! Из барабана появляются первые 10 чисел!");
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(lottery.get(i));
//
//        }

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");
//        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(neptune, venus, earth,
//                mars, jupiter, saturn, uranus, mercury));
//        System.out.println(solarSystem);
//        Collections.swap(solarSystem,solarSystem.indexOf(mercury), solarSystem.indexOf(neptune));
////        swap замена элементов по индексу;
//        System.out.println(solarSystem);
        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars));
        ArrayList<String> solarSystem1 = new ArrayList<>(Arrays.asList(jupiter, saturn, uranus, neptune));
        System.out.println(Collections.disjoint(solarSystem1, solarSystem));// проверяет есть хоть
        // один одинаковый элемент/Если нет — возвращает true, если есть — false.



    }
}

