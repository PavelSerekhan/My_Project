package com.company;

import java.util.ArrayList;

public class Solution {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void lister() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0)
                list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 4 == 0){
                list.remove(i);
                i--;

            }

        }
    }

    public static void main(String[] args) {
        lister();

    }
}


