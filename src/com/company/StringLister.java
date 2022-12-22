package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StringLister {
    String[] names = {"Андрей", "Борис", "Татьяна", "Светлана", "Наталья",
            "Александр", "Дмитрий", "Мария", "Нина"} ;
    public StringLister (String[] names){
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < names.length; i++) {
            list.add(names[i]);
        }
        Collections.sort(list);
        for (String name : list){
            System.out.println(name);
        }
    }
    public static void main(String[] args) {

        StringLister lister = new StringLister(args );
    }

}
