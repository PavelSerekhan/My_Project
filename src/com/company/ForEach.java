package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Привет","как","дела?");
//        list.forEach((s) -> System.out.println(s));
//        list.forEach(s -> System.out.println(s));//Так можно делать только если параметр один.
        // Если параметров несколько, нужно использовать скобки.
        list.forEach(System.out::println);

    }
}
