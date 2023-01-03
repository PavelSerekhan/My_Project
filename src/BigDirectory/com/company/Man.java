package com.company;

import java.util.Arrays;

public class Man {

    public static void main(String[] args) {
        int[] array = {10, 2, 9, 3, 1, 2, 5};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1 + i; j < array.length; j++) {
                int temp = array[i];//10
                if (temp > array[j]) {// j = 2
                    int x = array[j];// 2
                    array[i] = x;// 10==2
                    array[j] = temp;//2==10
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}














