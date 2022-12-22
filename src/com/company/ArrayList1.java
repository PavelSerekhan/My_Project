package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayList1 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Pavel");
//        list.add("Polina");
//        list.add("Viktoria");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String str = iterator.next();
//            System.out.println(str);
//        }
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Viktoria");
//        list.add("Polina");
//        list.add("Pavel");
//        for (int i = 0; i < list.size(); i++) {
//            String str = list.get(i);
//            System.out.println(str);
//        }
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Igor", "Diana", "Victor");
//        list.add("Igor");
//        list.add("Julia");
//        list.add("Diana");
        for (String str : list) {
            System.out.println(str);

        }
        System.out.println();

        ArrayList<String> listCopy = new ArrayList<>(list);
        for (String asr :
                listCopy) {
            if (list.equals("Julia"))
                list.remove(asr);
            System.out.println(asr);

        }
        System.out.println();



    }


}



