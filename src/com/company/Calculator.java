package com.company;

public class Calculator {
    public static void main(String[] args) {
        float sum = 0;
        String[] iks = {"1", "4x", "8", "1", "4", "1", "4"};
        for (String argument : iks) {
            try {
                sum = sum + Float.parseFloat(argument);
            } catch (NumberFormatException e) {
                System.out.println(argument + " - это не число.");
            }
        }
        System.out.println("Сумма этих чисел равна " + sum);
    }
}
