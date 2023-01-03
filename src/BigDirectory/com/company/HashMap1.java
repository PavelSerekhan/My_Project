package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Serega",32);
//        map.put("Igor", 11);
//        map.put("Egor", 22);
//
//        for (String key : map.keySet()){
//            Integer value = map.get(key);
//            System.out.println(key + " --> " + value);
//        }
//        HashMap<Integer,String> map = new HashMap<>();
//        map.put(0,"Привет");
//        map.put(1,"Hello");
//
//        String s = map.get(0);
//        map.put(0, s + "!");
//        for (String item: map.values()){
//            System.out.println(item);
//        }
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Привет");
//        list.add("Hello");
//
//        String s = list.get(0);
//        list.add(0,s + "!");
//        for (String s1: list){
//            System.out.println(s1);
//        }

        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
//        String lidiaName = passportsAndNames.get(212133);
//        System.out.println(lidiaName);
//        passportsAndNames.remove(162348);
//        System.out.println(passportsAndNames);
//        System.out.println(passportsAndNames.containsKey(412134));
//        System.out.println(passportsAndNames.containsValue("Дональд Джон Трамп"));
//        Set<Integer> key = passportsAndNames.keySet();
//        System.out.println("Ключи: " + key);
//        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
//        System.out.println("Значение: " + values);
//        System.out.println(passportsAndNames.size());
//        passportsAndNames.clear();
//        System.out.println(passportsAndNames);
//        if (!passportsAndNames.isEmpty()){
//            System.out.println(passportsAndNames);
//        }

//        HashMap<Integer,String> passportsAndNames1 = new HashMap<>();
//        passportsAndNames1.put(917352, "Алексей Андреевич Ермаков");
//        passportsAndNames1.put(925648, "Максим Олегович Архаров");
//
//        passportsAndNames.putAll(passportsAndNames1);//объединение 2 мап в 1
//        System.out.println(passportsAndNames);

        for (Map.Entry entry : passportsAndNames.entrySet()) {//перебор HashMap в цикле
            System.out.println(entry);
        }
    }
}

