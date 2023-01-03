package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zaniatie13 {
    public static void main(String[] args) {
//        ArrayList servants = new ArrayList(30);
        ArrayList<String> str = new ArrayList<String>(30);
        str.add(0,"Boris");
        str.add(1,"Pavel");
        str.add(2,"Viktoria");
        str.add(3,"Polina");
        str.add(4,"Diana");
        str.remove(0);
        str.remove("Boris");
        if (str.contains("Boris")){
            System.out.println("Boris naiden!!!");
        }
        int servantCount = str.size();
        for (String servant: str)
            System.out.println(servant);
        System.out.println(servantCount);
        for (int i = 0; i <str.size() ; i++) {
            String strt = str.get(i);
            System.out.println(strt);
            int servant = str.indexOf("Viktoria");
            System.out.println(servant);
            boolean diana = str.contains("Pavel");
        System.out.println(diana);

        String first = str.get(1);
        System.out.println(first);

        HashMap<String, Long> phoneBook = new HashMap<>();
        phoneBook.put("Turkey Line", 8_002_887_372L);
        phoneBook.put("BelAvia Bel", 8_000_666_777L);
        phoneBook.put("Eblan Eblan Eblan", 4_999_555_444_444L);
        long number = phoneBook.get("Turkey Line");
        long lent = phoneBook.getOrDefault("Lune", -1L);
        for (Map.Entry <String, Long> entry: phoneBook.entrySet()){
            String key = entry.getKey();
            Long value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
        System.out.println(number);
            
        }
    }
}
