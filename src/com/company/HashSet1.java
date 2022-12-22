package com.company;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Привет");
        set.add("Hello");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Namaste");
//        System.out.println(set.size());
//        System.out.println(set.remove("Hello"));
//        System.out.println(set.size());
//        System.out.println(set.contains("Hola"));
        for (String sets: set) {
            System.out.println(sets);

        }

//        Iterator<String> it = set.iterator();
//        while (it.hasNext()){
//            String str = it.next();
//            System.out.println(str);
//        }

//        Scanner console = new Scanner(System.in);
//        String s = console.nextLine();
//        if (set.contains(s)){
//            System.out.println("До спаткання!");
//        }

    }
}


