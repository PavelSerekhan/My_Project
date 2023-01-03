package com.company;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        String str1 = new String("Hello world!");
        String str2 = new String("My names is Earl");
        String str3 = new String("I love Java!");
        String str4 = new String("I live in Moscow");

        LinkedList<String> list = new LinkedList<>();
        list.add(str1);
        list.add(str3);
        list.add(str4);
        list.add(1,str2);
//        list.add("I live in Belarus");
        list.remove(1);
        System.out.println(list);

    }
}
