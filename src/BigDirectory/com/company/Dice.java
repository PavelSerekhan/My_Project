package com.company;

import java.util.Random;

public class Dice {
    public static void main(String[] args ) {
        Random generator = new Random();
        int value = generator.nextInt();
        System.out.println("Случайное число " + value);
        System.out.println(Math.sqrt(19600));
    }
}
