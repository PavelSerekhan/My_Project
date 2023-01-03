package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxLengthString {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Привет", "как", "дела?");
        Stream<String> stream = list.stream();

        Optional<String> optional = stream.max((s1,s2) ->s1.length() - s2.length());
        String max = optional.get();
//        String max = list.stream().max((s1, s2) -> s1.length() - s2.length()).get();
//        System.out.println(max);
    }
}
