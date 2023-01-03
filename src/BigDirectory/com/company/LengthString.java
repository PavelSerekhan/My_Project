package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LengthString {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"Привет","как","дела?");
//        Collections.sort(list, new StringLengthComparator());
//        System.out.println(list);

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Привет", "как", "дела?");

//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String name, String name2) {
//                return name.length() - name2.length();
//            }
//        };
        //или
//        Comparator<String> comparator = (String name, String name2) -> {
//            return name.length() - name2.length();
//        };
//        Collections.sort(list, comparator);

//        Collections.sort(list, (String name, String name2) -> {
//                    return name.length() - name2.length();
//                }
//        );
        Comparator<String> comparator = (name,name2) ->
                name.length() - name2.length();
        Collections.sort(list,comparator);

//        Collections.sort(list, (name, name2) -> name.length() - name2.length());


    }
}
