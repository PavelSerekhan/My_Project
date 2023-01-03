package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class First13Iz400 {
    public static void main(String[] args) {
        int[] thirteens = new int[400];
        int numFound = 0;
        int candidate = 1;
        while (numFound < 400) {
            if (candidate % 13 == 0) {
                thirteens[numFound] = candidate;
                numFound++;
            }
            candidate++;
        }
        System.out.println("Первыe 400 чисел кратных чисел 13:");
        for (int i = 0; i < 400; i++) {
            System.out.println(thirteens[i] + " ");

        }
    }
}






